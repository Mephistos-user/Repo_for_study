// import classes from './organs.module.scss';
import { styles } from "./style";

export const Organs = () => {
    const classes = styles()

    return (
        <>
            <div className={classes.container}>
                <div className={classes.item}>
                    <div className={classes.item__cover}></div>
                    <div className={classes.text}>
                        <img src="./logo192.png" alt="" className={classes.item__logo} />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </div>
                </div>
                <div className={classes.item}>
                    <div className={classes.item__cover}></div>
                    <div className={classes.text}>
                        <img src="./logo192.png" alt="" className={classes.item__logo} />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </div>
                </div>
                <div className={classes.item}>
                    <div className={classes.item__cover + " red"}></div>
                    <div className={classes.text}>
                        <img src="./logo192.png" alt="" className={classes.item__logo} />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </div>
                </div>
                <div className={classes.item}>
                    <div className={classes.item__cover}></div>
                    <div className={classes.text}>
                        <img src="./logo192.png" alt="" className={classes.item__logo} />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </div>
                </div>
            </div>
        </>
    )
}