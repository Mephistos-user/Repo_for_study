// import './news.css';
import styles from './news.module.css';

export const News = () => {
    console.log(styles, 'News')
    return (
        <>
            <div className="news-container">
                <div className="news__item">
                    <img className="news__item__image" src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className="news__item__image" src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className="news__item__image" src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className="news__item__image" src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className="news__item__image" src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className="news__item__image" src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
            </div>
        </>
    )
}