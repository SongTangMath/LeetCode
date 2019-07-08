#include<windows.h>



LRESULT CALLBACK WndProc (HWND, UINT, WPARAM, LPARAM) ;
int WINAPI WinMain(HINSTANCE hInstance,HINSTANCE hPrevstance,LPSTR   IpCmdLine,int iCmdShow)
{
	static TCHAR szAppName[]=TEXT("MyWin32App");
	HWND hwnd;
	MSG msg;
	WNDCLASS wndclass;
	wndclass.style=CS_VREDRAW|CS_HREDRAW|CS_DBLCLKS;
	wndclass.lpfnWndProc=WndProc;
	wndclass.cbClsExtra=0;
	wndclass.cbWndExtra = 0 ;
	wndclass.hInstance = hInstance ;
	wndclass.hIcon = LoadIcon (NULL, IDI_APPLICATION) ;
	wndclass.hCursor = LoadCursor (NULL, IDC_HELP) ;
	wndclass.hbrBackground = (HBRUSH) GetStockObject (WHITE_BRUSH) 

		;
	wndclass.lpszMenuName = NULL ;
	wndclass.lpszClassName = szAppName ;

	if(!RegisterClass(&wndclass))
	{
		MessageBox(NULL,"Failed to create window","Warning",0);
		return 0;
	}
	hwnd = CreateWindow( szAppName, // window class name
		TEXT ("The Hello Program"), // window caption
		WS_OVERLAPPEDWINDOW, // window style
		CW_USEDEFAULT, // initial x position
		CW_USEDEFAULT, // initial y position
		CW_USEDEFAULT, // initial x size
		CW_USEDEFAULT, // initial y size
		NULL, // parent window handle
		NULL, // window menu handle
		hInstance, // program instance handle
		NULL) ; // creation parameters


	ShowWindow (hwnd, iCmdShow) ;
	UpdateWindow (hwnd) ;
	while(GetMessage(&msg,NULL,0,0))
	{
		TranslateMessage(&msg);
		DispatchMessage(&msg);
	}

	return msg.wParam;
}
LRESULT CALLBACK WndProc (HWND hwnd, UINT message, WPARAM wParam, LPARAM lParam)
{
	static int cxClient,cyClient,widthOfRect,heightOfRect;
	static RECT rect[5][5];
	int i,j,xpos,ypos;
	HDC hdc;
	PAINTSTRUCT ps;
	POINT mousept;
	double result;
	static bool stateOfRect[5][5];
	switch(message)
	{
	case WM_SIZE:
		cxClient=LOWORD(lParam);
		cyClient=HIWORD(lParam);
		widthOfRect=cxClient/5;
		heightOfRect=cyClient/5;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				rect[i][j].left=j*widthOfRect;
				rect[i][j].top=i*heightOfRect;
				rect[i][j].right=(j+1)*widthOfRect;
				rect[i][j].bottom=(i+1)*heightOfRect;
				stateOfRect[i][j]=FALSE;
			}
		}
	case WM_PAINT:
		hdc=BeginPaint(hwnd,&ps);
		for(j=0;j<5;j++)//»­ºáÏß
		{
			MoveToEx(hdc,0,j*heightOfRect,NULL);
			LineTo(hdc,5*widthOfRect,j*heightOfRect);
		}
		for(i=0;i<5;i++)//»­ÊúÏß
		{
			MoveToEx(hdc,i*widthOfRect,0,NULL);
			LineTo(hdc,i*widthOfRect,5*heightOfRect);
		}
		EndPaint(hwnd,&ps);
		ReleaseDC(hwnd,hdc);
		return 0;
	
	case WM_LBUTTONDOWN:
		mousept.x=LOWORD(lParam);
		mousept.y=HIWORD(lParam);
		
		//ScreenToClient(hwnd,&mousept);
	for(i=0;i<5;i++)
	{
	for(j=0;j<5;j++)
	{ 
		result=PtInRect(&(rect[i][j]),mousept);
		if(result!=0)
		{
			xpos=i;
		    ypos=j;
			stateOfRect[xpos][ypos]^=1;
		}
	}
	}
	
	if(stateOfRect[xpos][ypos])
	{	
	hdc=GetDC(hwnd);
	MoveToEx(hdc,rect[xpos][ypos].left,rect[xpos][ypos].top,NULL);
    LineTo(hdc,rect[xpos][ypos].right,rect[xpos][ypos].bottom);
	MoveToEx(hdc,rect[xpos][ypos].left,rect[xpos][ypos].bottom,NULL);
    LineTo(hdc,rect[xpos][ypos].right,rect[xpos][ypos].top);
	ReleaseDC(hwnd,hdc);
	}
	else InvalidateRect(hwnd,&rect[xpos][ypos],TRUE);
	return 0;
	
	case WM_DESTROY:
		PostQuitMessage(0);
		return 0;
	}
	return DefWindowProc (hwnd, message, wParam, lParam) ;
}
