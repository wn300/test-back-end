/* global data */

function createCube(n) {
   return promise("http://localhost:8080/test-back-end/api/Cube/CreateCube/n/" + n, 'POST', {});
}

function updateCube(x, y ,z, w) {
   return promise("http://localhost:8080/test-back-end/api/Cube/UpdateCube/x/" + x + "/y/" + y + "/z/" + z + "/w/" + w, 'PUT', {});
}

function queryCube(xOne, yOne, zOne, xTwo, yTwo, zTwo) {
   return promise("http://localhost:8080/test-back-end/api/Cube/QueryCube/xOne/" + xOne + "/yOne/" + yOne + "/zOne/" + zOne + "/xTwo/" + xTwo + "/yTwo/" + yTwo + "/zTwo/" + zTwo, 'POST', {});
}

function getSum() {
   return get("http://localhost:8080/test-back-end/api/Cube/GetSum");
}

function promise(url, method, object) {
    return fetch(url, {
        method: method,
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(object)
    })
    .then(data => data);
}

function get(url) {
    return fetch(url)
    .then(data => data);
}
