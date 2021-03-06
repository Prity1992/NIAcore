USE [master]
GO
/****** Object:  Database [NIATestAutomationScenariosDB]    Script Date: 13-06-2015 17:32:44 ******/
CREATE DATABASE [NIATestAutomationScenariosDB]
Go
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'NIATestAutomatioScenariosDB', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\NIATestAutomatioScenariosDB.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'NIATestAutomatioScenariosDB_log', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\NIATestAutomatioScenariosDB_log.ldf' , SIZE = 7616KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [NIATestAutomationScenariosDB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET ARITHABORT OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET  DISABLE_BROKER 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET  MULTI_USER 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [NIATestAutomationScenariosDB]
GO

/****** Object:  Table [dbo].[app_Applications]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_Applications](
	[app_ID] [uniqueidentifier] NOT NULL,
	[app_Reference] [varchar](512) NULL,
	[app_Description] [text] NULL,
	[app_ProjectID] [uniqueidentifier] NULL,
	[app_ProjectReference] [varchar](512) NULL,
	[app_SerialNumber] [int] NULL,
	[app_DateCreated] [datetime] NULL,
	[app_DateUpdated] [datetime] NULL,
	[app_Deleted] [bit] NULL,
 CONSTRAINT [PK_app_Applications] PRIMARY KEY CLUSTERED 
(
	[app_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[app_TestPlanConfiguration]    Script Date: 13-06-2015 17:32:45 ******/

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_TestPlanConfiguration](
    [testPlanConfiguration_ID] [uniqueidentifier] NOT NULL,
    [testPlanConfiguration_PlatformToTestOn] [varchar](512) NULL,
    [testPlanConfiguration_BrowserToTestOn] [varchar](512) NULL,
    [testPlanConfiguration_BrowserVersionToTestOn] [varchar](512) NULL,
    CONSTRAINT [PK_app_TestPlanConfiguration] PRIMARY KEY CLUSTERED 
(
    [testPlanConfiguration_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[app_ExecutionMasterTestSuites]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_ExecutionMasterTestSuites](
	[executionMasterTestSuite_ID] [uniqueidentifier] NOT NULL,
	[executionMasterTestSuite_Reference] [varchar](512) NULL,
	[executionMasterTestSuite_Description] [text] NULL,
	[executionMasterTestSuite_TestPlanID] [uniqueidentifier] NULL,
	[executionMasterTestSuite_TestPlanReference] [varchar](512) NULL,
	[executionMasterTestSuite_MasterTestSuiteID] [uniqueidentifier] NULL,
	[executionMasterTestSuite_MasterTestSuiteReference] [varchar](512) NULL,
	[executionMasterTestSuite_SerialNumber] [int] NULL,
	[executionMasterTestSuite_ExecutionStatus] [int] NULL,
	[executionMasterTestSuite_NextExecutionBusinessDate] [datetime] NULL,
	[executionMasterTestSuite_StartTime] [datetime] NULL,
	[executionMasterTestSuite_EndTime] [datetime] NULL,
	[executionMasterTestSuite_DateCreated] [datetime] NULL,
	[executionMasterTestSuite_DateUpdated] [datetime] NULL,
	[executionMasterTestSuite_Deleted] [bit] NULL,
 CONSTRAINT [PK_app_ExecutionMasterTestSuite] PRIMARY KEY CLUSTERED 
(
	[executionMasterTestSuite_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_ExecutionTestScenarios]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_ExecutionTestScenarios](
	[executionTestScenario_ID] [uniqueidentifier] NOT NULL,
	[executionTestScenario_Reference] [varchar](512) NULL,
	[executionTestScenario_Lob] [varchar](512) NULL,
	[executionTestScenario_Product] [varchar](512) NULL,
	[executionTestScenario_Scripter] [varchar](512) NULL,
	[executionTestScenario_Description] [text] NULL,
	[executionTestScenario_ExecutionTestSuiteID] [uniqueidentifier] NULL,
	[executionTestScenario_ExecutionTestSuiteReference] [varchar](512) NULL,
	[executionTestScenario_TestPlanID] [uniqueidentifier] NULL,
	[executionTestScenario_TestPlanReference] [varchar](512) NULL,
	[executionTestScenario_MasterTestSuiteID] [uniqueidentifier] NULL,
	[executionTestScenario_MasterTestSuiteReference] [varchar](512) NULL,
	[executionTestScenario_TestSuiteID] [uniqueidentifier] NULL,
	[executionTestScenario_TestSuiteReference] [varchar](512) NULL,
	[executionTestScenario_TestScenarioID] [uniqueidentifier] NULL,
	[executionTestScenario_TestScenarioReference] [varchar](512) NULL,
	[executionTestScenario_SerialNumber] [int] NULL,
	[executionTestScenario_ExecutionStatus] [int] NULL,
	[executionTestScenario_LogFile] [text] NULL,
	[executionTestScenario_SnapShotFolder] [text] NULL,
	[executionTestScenario_NextSnapShotNumber] [int] NULL,
	[executionTestScenario_ErrorMessage] [text] NULL,
	[executionTestScenario_NextExecutionAutomationScriptStepToBeExecutedByMachine] [varchar](100) NULL,
	[executionTestScenario_NextExecutionAutomationScriptID] [uniqueidentifier] NULL,
	[executionTestScenario_NextExecutionAutomationScriptReference] [varchar](512) NULL,
	[executionTestScenario_NextExecutionAutomationScriptStepID] [uniqueidentifier] NULL,
	[executionTestScenario_NextExecutionAutomationScriptStepReference] [varchar](512) NULL,
	[executionTestScenario_NextExecutionAutomationScriptStepExecutionSequence] [int] NULL,
	[executionTestScenario_NextExecutionBusinessDate] [datetime] NULL,
	[executionTestScenario_StartTime] [datetime] NULL,
	[executionTestScenario_EndTime] [datetime] NULL,
	[executionTestScenario_DateCreated] [datetime] NULL,
	[executionTestScenario_DateUpdated] [datetime] NULL,
	[executionTestScenario_Deleted] [bit] NULL,
 CONSTRAINT [PK_ExecutionTestScenarios] PRIMARY KEY CLUSTERED 
(
	[executionTestScenario_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_ExecutionTestSteps]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_ExecutionTestSteps](
	[executionTestStep_ID] [uniqueidentifier] NOT NULL,
	[executionTestStep_Reference] [varchar](512) NULL,
	[executionTestStep_Description] [text] NULL,
	[executionTestStep_ExecutionTestScenarioID] [uniqueidentifier] NULL,
	[executionTestStep_ExecutionTestScenarioReference] [varchar](512) NULL,
	[executionTestStep_TestPlanID] [uniqueidentifier] NULL,
	[executionTestStep_TestPlanReference] [varchar](512) NULL,
	[executionTestStep_MasterTestSuiteID] [uniqueidentifier] NULL,
	[executionTestStep_MasterTestSuiteReference] [varchar](512) NULL,
	[executionTestStep_TestSuiteID] [uniqueidentifier] NULL,
	[executionTestStep_TestSuiteReference] [varchar](512) NULL,
	[executionTestStep_TestScenarioID] [uniqueidentifier] NULL,
	[executionTestStep_TestScenarioReference] [varchar](512) NULL,
	[executionTestStep_MasterAutomationScriptID] [uniqueidentifier] NULL,
	[executionTestStep_MasterAutomationScriptReference] [varchar](512) NULL,
	[executionTestStep_MasterAutomationScriptStepID] [uniqueidentifier] NULL,
	[executionTestStep_MasterAutomationScriptStepReference] [varchar](512) NULL,
	[executionTestStep_MasterAutomationScriptStepKeyword] [varchar](max) NULL,
	[executionTestStep_MasterAutomationScriptStepConfigData] [text] NULL,
	[executionTestStep_MasterAutomationScriptStepStepGroup] [text] NULL,
	[executionTestStep_MasterAutomationScriptStepExecutionSequence] [int] NULL,
	[executionTestStep_MasterAutomationScriptStepSkipStep] [varchar](100) NULL,
	[executionTestStep_MasterAutomationScriptStepToBeExecutedOnMachine] [varchar](100) NULL,
	[executionTestStep_MasterAutomationScriptStepLog] [text] NULL,
	[executionTestStep_ExecutionStatus] [int] NULL,
	[executionTestStep_LogMessage] [text] NULL,
	[executionTestStep_NextExecutionBusinessDate] [datetime] NULL,
	[executionTestStep_StartTime] [datetime] NULL,
	[executionTestStep_EndTime] [datetime] NULL,
	[executionTestStep_DateCreated] [datetime] NULL,
	[executionTestStep_DateUpdated] [datetime] NULL,
	[executionTestStep_Deleted] [bit] NULL,
 CONSTRAINT [PK_ExecutionTestScenarioSteps] PRIMARY KEY CLUSTERED 
(
	[executionTestStep_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_ExecutionTestSuites]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_ExecutionTestSuites](
	[executionTestSuite_ID] [uniqueidentifier] NOT NULL,
	[executionTestSuite_Reference] [varchar](512) NOT NULL,
	[executionTestSuite_Description] [text] NOT NULL,
	[executionTestSuite_ExecutionMasterTestSuiteID] [uniqueidentifier] NULL,
	[executionTestSuite_ExecutionMasterTestSuiteReference] [varchar](512) NULL,
	[executionTestSuite_TestPlanID] [uniqueidentifier] NULL,
	[executionTestSuite_TestPlanReference] [varchar](512) NULL,
	[executionTestSuite_MasterTestSuiteID] [uniqueidentifier] NULL,
	[executionTestSuite_MasterTestSuiteReference] [varchar](512) NULL,
	[executionTestSuite_TestSuiteID] [uniqueidentifier] NULL,
	[executionTestSuite_TestSuiteReference] [varchar](512) NULL,
	[executionTestSuite_TestSuiteRepositoryFile] [text] NULL,
	[executionTestSuite_TestSuiteExecutionPriority] [int] NULL,
	[executionTestSuite_TestSuiteExecutionMode] [varchar](50) NULL,
	[executionTestSuite_TestSuiteSerialNumber] [int] NULL,
	[executionTestSuite_ExecutionStatus] [int] NULL,
	[executionTestSuite_NextExecutionBusinessDate] [datetime] NULL,
	[executionTestSuite_ExecutionID] [uniqueidentifier] NULL,
	[executionTestSuite_CurrentTestScenarioIDForExecution] [uniqueidentifier] NULL,
	[executionTestSuite_CurrentTestScenarioReferenceForExecution] [varchar](512) NULL,
	[executionTestSuite_TargetExecutionResultsSummaryTestSuiteDBConnectionString] [text] NULL,
	[executionTestSuite_StartTime] [datetime] NULL,
	[executionTestSuite_EndTime] [datetime] NULL,
	[executionTestSuite_DateCreated] [datetime] NULL,
	[executionTestSuite_DateUpdated] [datetime] NULL,
	[executionTestSuite_Deleted] [bit] NULL,
 CONSTRAINT [PK_ExecutionTestSuite] PRIMARY KEY CLUSTERED 
(
	[executionTestSuite_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[app_MasterAutomationScripts]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_MasterAutomationScripts](
	[masterAutomationScript_ID] [uniqueidentifier] NOT NULL,
	[masterAutomationScript_Reference] [varchar](512) NULL,
	[masterAutomationScript_Description] [text] NULL,
	[masterAutomationScript_SerialNumber] [int] NULL,
	[masterAutomationScript_DateCreated] [datetime] NULL,
	[masterAutomationScript_DateUpdated] [datetime] NULL,
	[masterAutomationScript_Deleted] [bit] NULL,
 CONSTRAINT [PK_AutomationTestScripts] PRIMARY KEY CLUSTERED 
(
	[masterAutomationScript_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_MasterAutomationScriptSteps]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_MasterAutomationScriptSteps](
	[masterAutomationScriptStep_ID] [uniqueidentifier] NOT NULL,
	[masterAutomationScriptStep_Reference] [varchar](512) NULL,
	[masterAutomationScriptStep_AutomationScriptID] [uniqueidentifier] NULL,
	[masterAutomationScriptStep_AutomationScriptReference] [varchar](512) NULL,
	[masterAutomationScriptStep_StepKeyword] [varchar](max) NULL,
	[masterAutomationScriptStep_ConfigData] [varchar](max) NULL,
	[masterAutomationScriptStep_StepGroup] [varchar](max) NULL,
	[masterAutomationScriptStep_SerialNumber] [int] NULL,
	[masterAutomationScriptStep_ExecutionSequence] [int] NULL,
	[masterAutomationScriptStep_SkipStep] [varchar](100) NULL,
	[masterAutomationScriptStep_ToBeExecutedByMachine] [varchar](100) NULL,
	[masterAutomationScriptStep_DateCreated] [datetime] NULL,
	[masterAutomationScriptStep_DateUpdated] [datetime] NULL,
	[masterAutomationScriptStep_Deleted] [bit] NULL,
 CONSTRAINT [PK_AutomationScriptSteps] PRIMARY KEY CLUSTERED 
(
	[masterAutomationScriptStep_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_MasterTestSuites]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_MasterTestSuites](
	[masterTestSuite_ID] [uniqueidentifier] NOT NULL,
	[masterTestSuite_Reference] [varchar](512) NULL,
	[masterTestSuite_ProjectID] [uniqueidentifier] NULL,
	[masterTestSuite_ProjectReference] [varchar](512) NULL,
	[masterTestSuite_ApplicationID] [uniqueidentifier] NULL,
	[masterTestSuite_ApplicationReference] [varchar](512) NULL,
	[masterTestSuite_Description] [text] NULL,
	[masterTestSuite_SerialNumber] [int] NULL,
	[masterTestSuite_ExecuteMasterTestSuite] [varchar](6) NULL,
	[masterTestSuite_RepositoryFilePath] [text] NULL,
	[masterTestSuite_RepositoryAbsoluteFolderPath] [text] NULL,
	[masterTestSuite_DateCreated] [datetime] NULL,
	[masterTestSuite_DateUpdated] [datetime] NULL,
	[masterTestSuite_Deleted] [bit] NULL,
 CONSTRAINT [PK_MasterTestSuite] PRIMARY KEY CLUSTERED 
(
	[masterTestSuite_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_Modules]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_Modules](
	[mod_ID] [uniqueidentifier] NOT NULL,
	[mod_Reference] [varchar](512) NULL,
	[mod_Description] [text] NULL,
	[mod_SerialNumber] [int] NULL,
	[mod_ProjectID] [uniqueidentifier] NULL,
	[mod_ProjectReference] [varchar](512) NULL,
	[mod_ApplicationID] [uniqueidentifier] NULL,
	[mod_ApplicationReference] [varchar](512) NULL,
	[mod_DateCreated] [datetime] NULL,
	[mod_DateUpdated] [datetime] NULL,
	[mod_Deleted] [bit] NULL,
 CONSTRAINT [PK_app_Modules] PRIMARY KEY CLUSTERED 
(
	[mod_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_Projects]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_Projects](
	[prj_ID] [uniqueidentifier] NOT NULL,
	[prj_Reference] [varchar](512) NULL,
	[prj_Description] [text] NULL,
	[prj_SerialNumber] [int] NULL,
	[prj_DateCreated] [datetime] NULL,
	[prj_DateUpdated] [datetime] NULL,
	[prj_Deleted] [bit] NULL,
 CONSTRAINT [PK_Projects] PRIMARY KEY CLUSTERED 
(
	[prj_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_RuntimeConfigParameters]    Script Date: 14-03-2019 17:20:34 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[app_RuntimeConfigParameters](
	[runtimeConfigParameters_ID] [uniqueidentifier] NOT NULL,
	[runtimeConfigParameters_Reference] [varchar](50) NULL,
	[runtimeConfigParameters_KeyData] [int] NULL,
 CONSTRAINT [PK_app_RuntimeConfigParameters] PRIMARY KEY CLUSTERED 
(
	[runtimeConfigParameters_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_TestPlan]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_TestPlan](
	[testPlan_ID] [uniqueidentifier] NULL,
	[testPlan_Reference] [varchar](512) NULL,
	[testPlan_Description] [text] NULL,
	[testPlan_StartDate] [datetime] NULL,
	[testPlan_EndDate] [datetime] NULL,
	[testPlan_CurrentExecutionMasterTestSuiteID] [uniqueidentifier] NULL,
	[testPlan_CurrentExecutionMasterTestSuiteReference] [varchar](512) NULL,
	[testPlan_CurrentExecutionTestSuiteID] [uniqueidentifier] NULL,
	[testPlan_CurrentExecutionTestSuiteReference] [varchar](512) NULL,
	[testPlan_CurrentBusinessDate] [datetime] NULL,
	[testPlan_TargetExecutionResultsSummaryDBConnectionString] [text] NULL,
	[testPlan_TargetManualTestCaseSummaryDBConnectionString] [text] NULL,
	[testPlan_CurrentExecutionResultsFolder] [text] NULL,
	[testPlan_CurrentScenarioExecutionResultsFolder] [text] NULL,
	[testPlan_CurrentTestNGExecutionResultsFolder] [text] NULL,
	[testPlan_PlatformToTestOn] [varchar](100) NULL,
	[testPlan_BrowserToTestOn] [varchar](100) NULL,
	[testPlan_BrowserVersionToTestOn] [varchar](100) NULL,
	[testPlan_DateCreated] [datetime] NULL,
	[testPlan_DateUpdated] [datetime] NULL,
	[testPlan_Deleted] [bit] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[app_TestScenarios]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_TestScenarios](
	[testScenario_ID] [uniqueidentifier] NOT NULL,
	[testScenario_Reference] [varchar](512) NULL,
	[testScenario_Lob] [varchar](512) NULL,
	[testScenario_Product] [varchar](512) NULL,
	[testScenario_Scripter] [varchar](512) NULL,
	[testScenario_ProjectID] [uniqueidentifier] NULL,
	[testScenario_ProjectReference] [varchar](512) NULL,
	[testScenario_ApplicationID] [uniqueidentifier] NULL,
	[testScenario_ApplicationReference] [varchar](512) NULL,
	[testScenario_MasterTestSuiteID] [uniqueidentifier] NULL,
	[testScenario_MasterTestSuiteReference] [varchar](512) NULL,
	[testScenario_TestSuiteID] [uniqueidentifier] NULL,
	[testScenario_TestSuiteReference] [varchar](512) NULL,
	[testScenario_PrerequisiteTestSuiteID] [uniqueidentifier] NULL,
	[testScenario_PrerequisiteTestSuiteReference] [varchar](512) NULL,
	[testScenario_PrerequisiteTestScenarioID] [uniqueidentifier] NULL,
	[testScenario_PrerequisiteTestScenarioReference] [varchar](512) NULL,
	[testScenario_Objective] [text] NULL,
	[testScenario_Description] [text] NULL,
	[testScenario_MasterAutomationScriptID] [uniqueidentifier] NULL,
	[testScenario_MasterAutomationScriptReference] [varchar](512) NULL,
	[testScenario_SerialNumber] [int] NULL,
	[testScenario_ExecuteTestScenario] [varchar](6) NULL,
	[testScenario_DateCreated] [datetime] NULL,
	[testScenario_DateUpdated] [datetime] NULL,
	[testScenario_Deleted] [bit] NULL,
 CONSTRAINT [PK_TestScenarios_1] PRIMARY KEY CLUSTERED 
(
	[testScenario_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[ScenarioResultObject]    Script Date: 14-03-2019 16:47:05 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[ScenarioResultObject](
	[scenarioResultObject_ID] [uniqueidentifier] NOT NULL,
	[PlatformName] [varchar](256) NULL,
	[BrowserNameVersion] [varchar](256) NULL,
	[Lob] [varchar](256) NULL,
	[Product] [varchar](256) NULL,
	[ScenarioID] [varchar](256) NULL,
	[Regression] [varchar](256) NULL,
	[RegStartDateAndTime] [varchar](256) NULL,
	[DateTimeOfExecution] [varchar](256) NULL,
	[DurationOfExecution] [varchar](256) NULL,
	[ScenarioStatus] [varchar](256) NULL,
	[ReasonIfFailed] [varchar](500) NULL,
	[TypeOfFailure] [varchar](256) NULL,
	[ScripterName] [varchar](256) NULL,
 CONSTRAINT [PK_ScenarioResultObject] PRIMARY KEY CLUSTERED 
(
	[scenarioResultObject_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[app_TestSuites]    Script Date: 13-06-2015 17:32:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[app_TestSuites](
	[testSuite_ID] [uniqueidentifier] NOT NULL,
	[testSuite_Reference] [varchar](512) NULL,
	[testSuite_ProjectID] [uniqueidentifier] NULL,
	[testSuite_ProjectReference] [varchar](512) NULL,
	[testSuite_ApplicationID] [uniqueidentifier] NULL,
	[testSuite_ApplicationReference] [varchar](512) NULL,
	[testSuite_ModuleID] [uniqueidentifier] NULL,
	[testSuite_ModuleReference] [varchar](512) NULL,
	[testSuite_MasterTestSuiteID] [uniqueidentifier] NULL,
	[testSuite_MasterTestSuiteReference] [varchar](512) NULL,
	[testSuite_Description] [text] NULL,
	[testSuite_RepositoryFile] [text] NULL,
	[testSuite_RepositoryAbsoluteFolderPath] [text] NULL,
	[testSuite_ExecutionPriority] [int] NULL,
	[testSuite_ConfigurationID] [uniqueidentifier] NULL,
	[testSuite_ConfigurationReference] [varchar](512) NULL,
	[testSuite_ExecutionMode] [varchar](50) NULL,
	[testSuite_SerialNumber] [int] NULL,
	[testSuite_ExecuteTestSuite] [varchar](6) NULL,
	[testSuite_DateCreated] [datetime] NULL,
	[testSuite_DateUpdated] [datetime] NULL,
	[testSuite_Deleted] [bit] NULL,
 CONSTRAINT [PK_TestSuites] PRIMARY KEY CLUSTERED 
(
	[testSuite_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[app_MasterTestSuites] ADD  CONSTRAINT [DF_MasterTestSuite_masterTestSuite_ID]  DEFAULT (newid()) FOR [masterTestSuite_ID]
GO
USE [master]
GO
ALTER DATABASE [NIATestAutomationScenariosDB] SET  READ_WRITE 
GO

USE [NIATestAutomationScenariosDB];
Insert into [dbo].[app_RuntimeConfigParameters] values (newID(), 'TestPlanNextID', 1)
Go

Insert into [dbo].[app_RuntimeConfigParameters] values (newID(), 'ExecutionMasterTestSuiteNextID', 1)
Go

Insert into [dbo].[app_RuntimeConfigParameters] values (newID(), 'ExecutionTestSuiteNextID', 1)
Go

Insert into [dbo].[app_RuntimeConfigParameters] values (newID(), 'ExecutionTestScenarioNextID', 1)
Go

Insert into [dbo].[app_RuntimeConfigParameters] values (newID(), 'ExecutionTestStepNextID', 1)
Go















USE [master]
GO
/****** Object:  Database [NIATestAutomationDataDB]    Script Date: 13-06-2015 17:15:26 ******/
CREATE DATABASE [NIATestAutomationDataDB]
GO
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'NIATestAutomationDataDB', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\NIATestAutomationDataDB.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'NIATestAutomationDataDB_log', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\NIATestAutomationDataDB_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [NIATestAutomationDataDB] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [NIATestAutomationDataDB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [NIATestAutomationDataDB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET ARITHABORT OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET  DISABLE_BROKER 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET  MULTI_USER 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [NIATestAutomationDataDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [NIATestAutomationDataDB] SET  READ_WRITE 
GO
