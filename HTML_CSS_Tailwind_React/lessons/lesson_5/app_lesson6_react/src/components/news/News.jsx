import styles from './news.module.css';

export const News = () => {
    return (
        <>
            <div className={styles.container}>
                <div className="news__item">
                    <img className={styles.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={styles.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={styles.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={styles.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={styles.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <img className={styles.item__image} src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
            </div>
        </>
    )
}