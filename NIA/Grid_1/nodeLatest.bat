start "node" /B java -Dwebdriver.chrome.driver="./chromedriver.exe" -Dwebdriver.ie.driver="./IEDriverServer.exe" -Dwebdriver.firefox.driver="./geckodriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -port 5555 -hub http://10.150.252.74:4444/grid/register