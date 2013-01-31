<#assign idPrefix = StringUtils.randomString(6) />

<script type="text/javascript">
    function startCountdown() {
            var countdownDate = new Date("${countdownDate} ${countdownTime}");//input desired date here
            var currentDate = new Date();
            var dateDifference = new Date(countdownDate-currentDate);
            var seconds = dateDifference.valueOf()/1000;
            CountBack(seconds);
    }
    function CountBack(seconds) {
            var DisplayFormat = "DAYS Days, HOURS Hours, MINS Minutes, SECS Seconds.";
            DisplayFormat = DisplayFormat.replace("DAYS", (Math.floor(seconds/86400))%100000);
            DisplayFormat = DisplayFormat.replace("HOURS", (Math.floor(seconds/3600))%24);
            DisplayFormat = DisplayFormat.replace("MINS", (Math.floor(seconds/60))%60);
            DisplayFormat = DisplayFormat.replace("SECS", (Math.floor(seconds))%60);
            document.getElementById("time").innerHTML = DisplayFormat;
            setTimeout("CountBack("+(seconds-1)+")", 1000);
    }
    
    $j(document).ready(function() {
        startCountdown();
    });
</script>

<style type="text/css">

    p.countdown{
    font-size: 1em;
    text-align: center;
    }

    p.countdown .cd-time{
    display:inline;
    }

    p.countdown-BlackUI{
    color:#000;
    }

    p.countdown-BlackUI .cd-time{
    color:#000;
    }

    p.countdown-RedUI{
    color:#f00;
    }

    p.countdown-RedUI .cd-time{
    color:#c21017;
    }

    p.countdown-GreenUI{
    color:#10c217;
    }

    p.countdown-GreenUI .cd-time{
    color:#0f0;
    }

    p.countdown-BlueUI{
    color:#00f;
    }

    p.countdown-BlueUI .cd-time{
    color:#1017c2;
    }

</style>

<<<<<<< HEAD
<p id="time" class="countdown countdown-${labelColor}UI"></p>
=======
<script type="text/javascript">

    $j(document).ready(function () {

    $j("#time").countdown({
        date: "${countdownDate} ${countdownTime}",
        leadingZero: true
    });

    });

</script>

<p id="${idPrefix}-timer" class="countdown countdown-${labelColor}UI">
	<span id="${idPrefix}-timer-days"></span> <span class='cd-time'>days</span> <span id="${idPrefix}-timer-hours"></span> <span class='cd-time'>hours</span> <span id="${idPrefix}-timer-mins"></span> <span class='cd-time'>mins</span> <span id="${idPrefix}-timer-sec"></span> <span class='cd-time'>sec</span>
</p>
>>>>>>> 18dffdf86a7f56900e6ae0134f386cf3b71b7f38
