var http = require('http');
var port = 8084;
var server = http.createServer(function(request, response) {
    response.end('Hello Node.js Server!');
});

server.listen(port, (err) => {
    if (err) {
        console.error(err);
        return;
    }

    console.log('server is listening on ' + port);
});
