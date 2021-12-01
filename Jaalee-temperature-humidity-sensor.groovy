https://sensor.jaalee.com/v1/open/code
	HTTP/1.1 200 OK
{
    "code":"0",
    "message": "",
    "data":{
    }
}


https://sensor.jaalee.com/v1/open/login
	HTTP/1.1 200 OK
{
    "code":"0",
    "message": "",
    "data":{
        token:'VRXqSnC89uGI4v66jaxNdQ=='
    }
}


https://sensor.jaalee.com/v1/open/data
HTTP/1.1 200 OK
{
    "code":"0",
    "message": "",
    "data":{
        total:10000,
        power:99, // power
        list:[{
            id:1,  // record id
            temperature:25.3, // temperature value
            humidity:0.78, // humidity value
            createTime:4564576341534; // create time of milliseconds
        }]
    }
}


https://sensor.jaalee.com/v1/open/htplu
TTP/1.1 200 OK
{
"code":"0",
"message": "",
"data":{
total:10000,
power:100
list:[{
         id:1,  // record id
         temperature:25.3, // temperature value
         humidity:0.78, // humidity value
         pressure:0.78, // pressure value
         light:0.78, // light value
         uv:0.78, // uv value
         createTime:4564576341534; // create time of milliseconds
}]
}
}


https://sensor.jaalee.com/v1/open/pt
HTTP/1.1 200 OK
{
"code":"0",
"message": "",
"data":{
total:10000,
list:[{
         id:1,  // record id
         temperature:25.3, // temperature value
         createTime:4564576341534; // create time of milliseconds
}]
}
}


