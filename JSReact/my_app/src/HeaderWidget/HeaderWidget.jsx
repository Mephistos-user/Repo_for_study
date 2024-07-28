import React, { useEffect, useState } from "react";

const HeaderWidget = () => {

    const [weatherData, setWeatherData] = useState(null);

    useEffect(() => {
        fetch('https://api.openweathermap.org/data/3.0/onecall?q={Moscow}&appid={5591418349a791d783307032073fad52}')
        .then((data) => {console.log(data)})
    }, [])

    return (
        <div className="header-weather-widget">
            <p className="header-weather-widget__label">Погода на сегодня в Москве</p>
            <div className="header-weather-widget__weather-data">Здесь будет погода</div>
        </div>
    )
}

export default HeaderWidget;