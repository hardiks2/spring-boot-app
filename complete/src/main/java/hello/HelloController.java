package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "<!DOCTYPE html>
<html >
<head>
  <meta charset='UTF-8'>
  <title>CSS Birthday Cake</title>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css'>

  <script src='https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js'></script>
<script>
     window.open = function() {};
            window.print = function() {};
            // Support hover state for mobile.
            if (false) {
                window.ontouchstart = function() {};
            }
</script>
<style>

 body {
  background-image: -webkit-gradient(radial, 50% 50%, 0, 50% 50%, 100, color-stop(0%, #374566), color-stop(100%, #010203));
  background-image: -webkit-radial-gradient(#374566, #010203);
  background-image: -moz-radial-gradient(#374566, #010203);
  background-image: -o-radial-gradient(#374566, #010203);
  background-image: radial-gradient(#374566, #010203);
}

.cake {
  position: absolute;
  width: 250px;
  height: 200px;
  top: 50%;
  left: 50%;
  margin-top: 220px;

}

.plate {
  width: 270px;
  height: 110px;
  position: absolute;
  bottom: -10px;
  left: -10px;
  background-color: #ccc;
  border-radius: 50%;
  box-shadow: 0 2px 0 #b3b3b3, 0 4px 0 #b3b3b3, 0 5px 40px rgba(0, 0, 0, 0.5);
}

.cake > * {
  position: absolute;
}

.layer {
  position: absolute;
  display: block;
  width: 250px;
  height: 100px;
  border-radius: 50%;
  background-color: #553c13;
  box-shadow: 0 2px 0px #6a4b18, 0 4px 0px #33240b, 0 6px 0px #32230b, 0 8px 0px #31230b, 0 10px 0px #30220b, 0 12px 0px #2f220b, 0 14px 0px #2f210a, 0 16px 0px #2e200a, 0 18px 0px #2d200a, 0 20px 0px #2c1f0a, 0 22px 0px #2b1f0a, 0 24px 0px #2a1e09, 0 26px 0px #2a1d09, 0 28px 0px #291d09, 0 30px 0px #281c09;
}

.layer-top {
  top: 0px;
}

.layer-middle {
  top: 33px;
}

.layer-bottom {
  top: 66px;
}

.icing {
  top: 2px;
  left: 5px;
  background-color: #f0e4d0;
  width: 240px;
  height: 90px;
  border-radius: 50%;
}
.icing:before {
  content: '';
  position: absolute;
  top: 4px;
  right: 5px;
  bottom: 6px;
  left: 5px;
  background-color: #f4ebdc;
  box-shadow: 0 0 4px #f6efe3, 0 0 4px #f6efe3, 0 0 4px #f6efe3;
  border-radius: 50%;
  z-index: 1;
}

.drip {
  display: block;
  width: 50px;
  height: 60px;
  border-bottom-left-radius: 25px;
  border-bottom-right-radius: 25px;
  background-color: #f0e4d0;
}

.drip1 {
  top: 53px;
  left: 5px;
  transform: skewY(15deg);
  height: 48px;
  width: 40px;
}

.drip2 {
  top: 69px;
  left: 181px;
  transform: skewY(-15deg);
}

.drip3 {
  top: 54px;
  left: 90px;
  width: 80px;
  border-bottom-left-radius: 40px;
  border-bottom-right-radius: 40px;
}

.candle {
  background-color: #7B020B;
  width: 16px;
  height: 50px;
  border-radius: 8px / 4px;
  top: -20px;
  left: 50%;
  margin-left: -8px;
  z-index: 10;
}
.candle:before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 16px;
  height: 8px;
  border-radius: 50%;
  background-color: #ad030f;
}

.flame {
  position: absolute;
  background-color: orange;
  width: 15px;
  height: 35px;
  border-radius: 10px 10px 10px 10px / 25px 25px 10px 10px;
  top: -34px;
  left: 50%;
  margin-left: -7.5px;
  z-index: 10;
  box-shadow: 0 0 10px rgba(255, 165, 0, 0.5), 0 0 20px rgba(255, 165, 0, 0.5), 0 0 60px rgba(255, 165, 0, 0.5), 0 0 80px rgba(255, 165, 0, 0.5);
  transform-origin: 50% 90%;
  animation: flicker 1s ease-in-out alternate infinite;
}

@keyframes flicker {
  0% {
    transform: skewX(5deg);
    box-shadow: 0 0 10px rgba(255, 165, 0, 0.2), 0 0 20px rgba(255, 165, 0, 0.2), 0 0 60px rgba(255, 165, 0, 0.2), 0 0 80px rgba(255, 165, 0, 0.2);
  }
  25% {
    transform: skewX(-5deg);
    box-shadow: 0 0 10px rgba(255, 165, 0, 0.5), 0 0 20px rgba(255, 165, 0, 0.5), 0 0 60px rgba(255, 165, 0, 0.5), 0 0 80px rgba(255, 165, 0, 0.5);
  }
  50% {
    transform: skewX(10deg);
    box-shadow: 0 0 10px rgba(255, 165, 0, 0.3), 0 0 20px rgba(255, 165, 0, 0.3), 0 0 60px rgba(255, 165, 0, 0.3), 0 0 80px rgba(255, 165, 0, 0.3);
  }
  75% {
    transform: skewX(-10deg);
    box-shadow: 0 0 10px rgba(255, 165, 0, 0.4), 0 0 20px rgba(255, 165, 0, 0.4), 0 0 60px rgba(255, 165, 0, 0.4), 0 0 80px rgba(255, 165, 0, 0.4);
  }
  100% {
    transform: skewX(5deg);
    box-shadow: 0 0 10px rgba(255, 165, 0, 0.5), 0 0 20px rgba(255, 165, 0, 0.5), 0 0 60px rgba(255, 165, 0, 0.5), 0 0 80px rgba(255, 165, 0, 0.5);
  }
}
 span {
                text-transform: uppercase;
            }
            .container {
                width: 800px;
                height: 420px;
                padding: 10px;
                margin: 0 auto;
                position: relative;
            }
            .balloon {
                width: 738px;
                margin: 0 auto;
                padding-top: 30px;
                position: relative;
            }
            .balloon > div {
                width: 104px;
                height: 140px;
                background: rgba(182, 15, 97, 0.9);
                border-radius: 0;
                border-radius: 80% 80% 80% 80%;
                margin: 0 auto;
                position: absolute;
                padding: 10px;
                box-shadow: inset 17px 7px 10px rgba(182, 15, 97, 0.9);
                -webkit-transform-origin: bottom center;
            }
            .balloon > div:nth-child(1) {
                background: rgba(182, 15, 97, 0.9);
                left: 0;
                box-shadow: inset 10px 10px 10px rgba(135, 11, 72, 0.9);
                -webkit-animation: balloon1 6s ease-in-out infinite;
                -moz-animation: balloon1 6s ease-in-out infinite;
                -o-animation: balloon1 6s ease-in-out infinite;
                animation: balloon1 6s ease-in-out infinite;
            }
            .balloon > div:nth-child(1):before {
                color: rgba(182, 15, 97, 0.9);
            }
            .balloon > div:nth-child(2) {
                background: rgba(242, 112, 45, 0.9);
                left: 120px;
                box-shadow: inset 10px 10px 10px rgba(222, 85, 14, 0.9);
                -webkit-animation: balloon2 6s ease-in-out infinite;
                -moz-animation: balloon2 6s ease-in-out infinite;
                -o-animation: balloon2 6s ease-in-out infinite;
                animation: balloon2 6s ease-in-out infinite;
            }
            .balloon > div:nth-child(2):before {
                color: rgba(242, 112, 45, 0.9);
            }
            .balloon > div:nth-child(3) {
                background: rgba(45, 181, 167, 0.9);
                left: 240px;
                box-shadow: inset 10px 10px 10px rgba(35, 140, 129, 0.9);
                -webkit-animation: balloon4 6s ease-in-out infinite;
                -moz-animation: balloon4 6s ease-in-out infinite;
                -o-animation: balloon4 6s ease-in-out infinite;
                animation: balloon4 6s ease-in-out infinite;
            }
            .balloon > div:nth-child(3):before {
                color: rgba(45, 181, 167, 0.9);
            }
            .balloon > div:nth-child(4) {
                background: rgba(190, 61, 244, 0.9);
                left: 360px;
                box-shadow: inset 10px 10px 10px rgba(173, 14, 240, 0.9);
                -webkit-animation: balloon1 5s ease-in-out infinite;
                -moz-animation: balloon1 5s ease-in-out infinite;
                -o-animation: balloon1 5s ease-in-out infinite;
                animation: balloon1 5s ease-in-out infinite;
            }
            .balloon > div:nth-child(4):before {
                color: rgba(190, 61, 244, 0.9);
            }
            .balloon > div:nth-child(5) {
                background: rgba(180, 224, 67, 0.9);
                left: 480px;
                box-shadow: inset 10px 10px 10px rgba(158, 206, 34, 0.9);
                -webkit-animation: balloon3 5s ease-in-out infinite;
                -moz-animation: balloon3 5s ease-in-out infinite;
                -o-animation: balloon3 5s ease-in-out infinite;
                animation: balloon3 5s ease-in-out infinite;
            }
            .balloon > div:nth-child(5):before {
                color: rgba(180, 224, 67, 0.9);
            }
            .balloon > div:nth-child(6) {
                background: rgba(242, 194, 58, 0.9);
                left: 600px;
                box-shadow: inset 10px 10px 10px rgba(234, 177, 15, 0.9);
                -webkit-animation: balloon2 3s ease-in-out infinite;
                -moz-animation: balloon2 3s ease-in-out infinite;
                -o-animation: balloon2 3s ease-in-out infinite;
                animation: balloon2 3s ease-in-out infinite;
            }
            .balloon > div:nth-child(6):before {
                color: rgba(242, 194, 58, 0.9);
            }
            .balloon > div:before {
                color: rgba(182, 15, 97, 0.9);
                position: absolute;
                bottom: -11px;
                left: 52px;
                content:'▲';
                font-size: 1em;
            }
            span {
                font-size: 4.8em;
                color: white;
                position: relative;
                top: 30px;


            }
            /*BALLOON 1 4*/
            @-webkit-keyframes balloon1 {
                0%, 100% {
                    -webkit-transform: translateY(0) rotate(-6deg);
                }
                50% {
                    -webkit-transform: translateY(-20px) rotate(8deg);
                }
            }
            @-moz-keyframes balloon1 {
                0%, 100% {
                    -moz-transform: translateY(0) rotate(-6deg);
                }
                50% {
                    -moz-transform: translateY(-20px) rotate(8deg);
                }
            }
            @-o-keyframes balloon1 {
                0%, 100% {
                    -o-transform: translateY(0) rotate(-6deg);
                }
                50% {
                    -o-transform: translateY(-20px) rotate(8deg);
                }
            }
            @keyframes balloon1 {
                0%, 100% {
                    transform: translateY(0) rotate(-6deg);
                }
                50% {
                    transform: translateY(-20px) rotate(8deg);
                }
            }
            /* BAllOON 2 5*/
            @-webkit-keyframes balloon2 {
                0%, 100% {
                    -webkit-transform: translateY(0) rotate(6eg);
                }
                50% {
                    -webkit-transform: translateY(-30px) rotate(-8deg);
                }
            }
            @-moz-keyframes balloon2 {
                0%, 100% {
                    -moz-transform: translateY(0) rotate(6deg);
                }
                50% {
                    -moz-transform: translateY(-30px) rotate(-8deg);
                }
            }
            @-o-keyframes balloon2 {
                0%, 100% {
                    -o-transform: translateY(0) rotate(6deg);
                }
                50% {
                    -o-transform: translateY(-30px) rotate(-8deg);
                }
            }
            @keyframes balloon2 {
                0%, 100% {
                    transform: translateY(0) rotate(6deg);
                }
                50% {
                    transform: translateY(-30px) rotate(-8deg);
                }
            }
            /* BAllOON 0*/
            @-webkit-keyframes balloon3 {
                0%, 100% {
                    -webkit-transform: translate(0, -10px) rotate(6eg);
                }
                50% {
                    -webkit-transform: translate(-20px, 30px) rotate(-8deg);
                }
            }
            @-moz-keyframes balloon3 {
                0%, 100% {
                    -moz-transform: translate(0, -10px) rotate(6eg);
                }
                50% {
                    -moz-transform: translate(-20px, 30px) rotate(-8deg);
                }
            }
            @-o-keyframes balloon3 {
                0%, 100% {
                    -o-transform: translate(0, -10px) rotate(6eg);
                }
                50% {
                    -o-transform: translate(-20px, 30px) rotate(-8deg);
                }
            }
            @keyframes balloon3 {
                0%, 100% {
                    transform: translate(0, -10px) rotate(6eg);
                }
                50% {
                    transform: translate(-20px, 30px) rotate(-8deg);
                }
            }
            /* BAllOON 3*/
            @-webkit-keyframes balloon4 {
                0%, 100% {
                    -webkit-transform: translate(10px, -10px) rotate(-8eg);
                }
                50% {
                    -webkit-transform: translate(-15px, 20px) rotate(10deg);
                }
            }
            @-moz-keyframes balloon4 {
                0%, 100% {
                    -moz-transform: translate(10px, -10px) rotate(-8eg);
                }
                50% {
                    -moz-transform: translate(-15px, 10px) rotate(10deg);
                }
            }
            @-o-keyframes balloon4 {
                0%, 100% {
                    -o-transform: translate(10px, -10px) rotate(-8eg);
                }
                50% {
                    -o-transform: translate(-15px, 10px) rotate(10deg);
                }
            }
            @keyframes balloon4 {
                0%, 100% {
                    transform: translate(10px, -10px) rotate(-8eg);
                }
                50% {
                    transform: translate(-15px, 10px) rotate(10deg);
                }
            }
            h1 {
                position: relative;
                top: 200px;
                text-align: center;
                color: white;
                font-size: 3.5em;
            }
</style>
</head>

<body style='color:#fff;'>

    <center>

  <div class='cake'>
    <div class='plate'></div>
    <div class='layer layer-bottom'></div>
    <div class='layer layer-middle'></div>
    <div class='layer layer-top'></div>
    <div class='icing'></div>
    <div class='drip drip1'></div>
    <div class='drip drip2'></div>
    <div class='drip drip3'></div>
    <div class='candle'>
        <div class='flame'></div>
    </div>
</div>

 <link href='https://fonts.googleapis.com/css?family=Wendy+One' rel='stylesheet' type='text/css'>
        <div class='container'>
            <div class='balloon'>
                <div><span>☺</span>
                </div>
                <div><span>B</span>
                </div>
                <div><span>D</span>
                </div>
                <div><span>A</span>
                </div>
                <div><span>Y</span>
                </div>
                <div><span>!</span>
                </div>
            </div>
             <h1>HAPPY BIRTHDAY HARDIK</h1>

        </div>

  <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>

  </center>
</body>
</html>";
    }

    @RequestMapping("/home")
    public String index1(@RequestParam(value="name") String name) {
        System.out.println("Name : "+name);
        return "Hello "+name+" !";
    }

}
