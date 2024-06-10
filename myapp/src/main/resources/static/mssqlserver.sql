CREATE TABLE [ftwdbo].[Student](
	[id] [uniqueidentifier] NOT NULL,
	[name] [varchar](20) NULL,
	[email] [varchar](20) NULL,
	[department] [varchar](15) NULL,
	[date] [datetime2](7) NOT NULL,
	[modifiedDate] [datetime2](7) NULL
) ON [PRIMARY]
GO