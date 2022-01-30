var url = "http://mylogger.io/log";

function log(message)
{
    // Send an HTTP Request

    console.log(message);

}

function repeat(message)
{
    console.log(message);
}

module.exports.log = log;

module.exports.torepeat = repeat;

// module.exports.endPointurl = url; 
