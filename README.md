# Các bước cài đặt 
- Cài đặt eclipse 
- Tùy chỉnh dependencies qua apache Maven của eclipse (file pom.xml)
- Tiến hành run src/test/java/RunApi.java để  chạy các kiểm thử 

# Tự động kiểm thử  bằng Junit 
## Test 1 api
- Vào đường dẫn  src/test/java/Api/Base.java
- Bỏ comment '''//api.setBaseURL(); ''' ở method initT và '''//api.resetBaseURL(); ''' ở method endT
- Tùy chọn 1 trong các api còn lại để tiến hành kiểm thử
- Run file để  kiểm thử 

## Test nhiều api
- Tương tự 2 bước đầu của Test 1 api
- Vào đường dẫn  src/test/java/TestSuite/AllApiTest.java và tự implement các api muốn kiểm tra vào trong @Suite.SuiteClasses theo format "tên api".class
- Run file để  kiểm thử 
