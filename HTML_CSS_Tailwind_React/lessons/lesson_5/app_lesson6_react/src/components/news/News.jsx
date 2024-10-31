// import classes from './news.module.scss';
import { styles } from "./style";

export const News = () => {
    const classes = styles()

    return (
        <>
            <div className={classes.container}>
                <div className="news__item">
                    <img className={classes.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={classes.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={classes.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={classes.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={classes.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={classes.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
            </div>
        </>
    )
}