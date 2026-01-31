set VERSION=%1
if "%VERSION%"=="" set VERSION=latest

call ./gradlew.bat clean build -x test
call docker compose down
call docker compose build
call docker tag gabrieljamesbenedict/card-colosseum:latest gabrieljamesbenedict/card-colosseum:%VERSION%