@echo off
REM ==================================================
REM Versão simplificada - sem runtime customizado
REM Use se a versão completa apresentar problemas
REM ==================================================

set APP_NAME=Conversor_Dollar_Latino
set APP_VERSION=1.0.0
set MAIN_CLASS=Principal.Principal
set MAIN_JAR=Conversor_Dollar_Latino.jar
set ICON=icone.ico
set DEST=dist
set INPUT_DIR=out\artifacts\Conversor_Dollar_Latino_jar

echo 🔄 Limpando pasta de destino...
if exist %DEST% rmdir /s /q %DEST%
mkdir %DEST%

echo 🚀 Gerando instalador .exe (versão simples)...
jpackage ^
  --input "%INPUT_DIR%" ^
  --main-jar "%MAIN_JAR%" ^
  --main-class "%MAIN_CLASS%" ^
  --name "%APP_NAME%" ^
  --type exe ^
  --app-version "%APP_VERSION%" ^
  --icon "%ICON%" ^
  --dest "%DEST%" ^
  --win-console ^
  --java-options "-Xmx256m"

if errorlevel 1 (
    echo ❌ ERRO: Falha ao gerar o instalador
    pause
    exit /b 1
)

echo ✅ Instalador gerado em %DEST%\%APP_NAME%-%APP_VERSION%.exe
pause