USE [db_ql_cuahangsach]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 14/05/2023 6:53:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaSach] [int] NOT NULL,
	[MaHoaDon] [int] NOT NULL,
	[SoLuong] [int] NULL,
	[DonGia] [money] NULL,
 CONSTRAINT [pk_cthd] PRIMARY KEY CLUSTERED 
(
	[MaSach] ASC,
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 14/05/2023 6:53:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[NgayLap] [date] NULL,
	[ThanhTien] [money] NULL,
	[TenKhachHang] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaXuatBan]    Script Date: 14/05/2023 6:53:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaXuatBan](
	[MaNXB] [int] IDENTITY(1,1) NOT NULL,
	[TenNXB] [nvarchar](255) NULL,
	[DiaChiNXB] [nvarchar](255) NULL,
	[DienThoai] [nchar](11) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNXB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sach]    Script Date: 14/05/2023 6:53:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sach](
	[MaSach] [int] IDENTITY(1,1) NOT NULL,
	[TenSach] [nvarchar](255) NULL,
	[MaTheLoai] [int] NULL,
	[MaNXB] [int] NULL,
	[TacGia] [nvarchar](255) NULL,
	[soluong] [int] NULL,
	[gia] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 14/05/2023 6:53:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[TenDangNhap] [nvarchar](50) NULL,
	[MatKhau] [nvarchar](20) NULL,
	[Sdt] [nchar](11) NULL,
	[LoaiTaiKhoan] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TheLoai]    Script Date: 14/05/2023 6:53:33 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TheLoai](
	[MaTheLoai] [int] IDENTITY(1,1) NOT NULL,
	[TenTheLoai] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (2, 14, 10, 90000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (2, 15, 6, 90000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (2, 16, 5, 90000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (2, 17, 5, 90000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (2, 18, 5, 90000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (3, 14, 10, 25000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (3, 15, 9, 25000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (3, 16, 5, 35000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (4, 16, 6, 35000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (4, 17, 5, 35000.0000)
INSERT [dbo].[ChiTietHoaDon] ([MaSach], [MaHoaDon], [SoLuong], [DonGia]) VALUES (4, 18, 5, 35000.0000)
GO
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [ThanhTien], [TenKhachHang]) VALUES (14, CAST(N'2023-04-20' AS Date), 1150000.0000, N'Lê Thanh Long')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [ThanhTien], [TenKhachHang]) VALUES (15, CAST(N'2023-04-20' AS Date), 765000.0000, N'Bich Hanh')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [ThanhTien], [TenKhachHang]) VALUES (16, CAST(N'2023-04-27' AS Date), 660000.0000, N'Lê Thành Long')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [ThanhTien], [TenKhachHang]) VALUES (17, CAST(N'2023-04-27' AS Date), 625000.0000, N'Trần Vũ Kha')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [ThanhTien], [TenKhachHang]) VALUES (18, CAST(N'2023-04-27' AS Date), 625000.0000, N'Tuyết Phụng')
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
GO
SET IDENTITY_INSERT [dbo].[NhaXuatBan] ON 

INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB], [DiaChiNXB], [DienThoai]) VALUES (1, N'Khoa học xã hội', N'Hà Nội', N'025874569  ')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB], [DiaChiNXB], [DienThoai]) VALUES (2, N'Tổng hợp', N'TP HCM', N'025417896  ')
SET IDENTITY_INSERT [dbo].[NhaXuatBan] OFF
GO
SET IDENTITY_INSERT [dbo].[Sach] ON 

INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaNXB], [TacGia], [soluong], [gia]) VALUES (2, N'Đắc nhân tâm', 3, 1, N'Dale Carnegie', 90, 90000)
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaNXB], [TacGia], [soluong], [gia]) VALUES (3, N'Nhập môn lập trình', 3, 2, N'Lê Thành Long', 45, 25000)
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaNXB], [TacGia], [soluong], [gia]) VALUES (4, N'Kỹ thuật lập trình', 1, 2, N'Ngô Thành Tiến', 90, 35000)
SET IDENTITY_INSERT [dbo].[Sach] OFF
GO
SET IDENTITY_INSERT [dbo].[TaiKhoan] ON 

INSERT [dbo].[TaiKhoan] ([id], [TenDangNhap], [MatKhau], [Sdt], [LoaiTaiKhoan]) VALUES (1, N'admin', N'admin', N'0933026960 ', 1)
INSERT [dbo].[TaiKhoan] ([id], [TenDangNhap], [MatKhau], [Sdt], [LoaiTaiKhoan]) VALUES (2, N'tranvukha', N'kha123', N'0257413669 ', 2)
INSERT [dbo].[TaiKhoan] ([id], [TenDangNhap], [MatKhau], [Sdt], [LoaiTaiKhoan]) VALUES (3, N'levy', N'levy123', N'0258741366 ', 2)
SET IDENTITY_INSERT [dbo].[TaiKhoan] OFF
GO
SET IDENTITY_INSERT [dbo].[TheLoai] ON 

INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (1, N'Sách thiếu nhi')
INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (2, N'Sách trinh thám')
INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (3, N'Sách kinh điển')
SET IDENTITY_INSERT [dbo].[TheLoai] OFF
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [uni]    Script Date: 14/05/2023 6:53:33 PM ******/
ALTER TABLE [dbo].[TaiKhoan] ADD  CONSTRAINT [uni] UNIQUE NONCLUSTERED 
(
	[TenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [fk_hd_cthd] FOREIGN KEY([MaHoaDon])
REFERENCES [dbo].[HoaDon] ([MaHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [fk_hd_cthd]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [fk_sach_cthd] FOREIGN KEY([MaSach])
REFERENCES [dbo].[Sach] ([MaSach])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [fk_sach_cthd]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [fk_sach_nxb] FOREIGN KEY([MaNXB])
REFERENCES [dbo].[NhaXuatBan] ([MaNXB])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [fk_sach_nxb]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [fk_sach_theloai] FOREIGN KEY([MaTheLoai])
REFERENCES [dbo].[TheLoai] ([MaTheLoai])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [fk_sach_theloai]
GO
