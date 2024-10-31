import styles from './organs.module.css';

export const Organs = () => {
    return (
        <>
            <div className={styles.container}>
                <div className={styles.item}>
                    <div className={styles.item__cover}></div>
                    <div className={styles.text}>
                        <img src="./logo192.png" alt="" className={styles.item__logo} />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </div>
                </div>
                <div className={styles.item}>
                    <div className={styles.item__cover}></div>
                    <div className={styles.text}>
                        <img src="./logo192.png" alt="" className={styles.item__logo} />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </div>
                </div>
                <div className={styles.item}>
                    <div className={styles.item__cover}></div>
                    <div className={styles.text}>
                        <img src="./logo192.png" alt="" className={styles.item__logo} />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </div>
                </div>
                <div className={styles.item}>
                    <div className={styles.item__cover}></div>
                    <div className={styles.text}>
                        <img src="./logo192.png" alt="" className={styles.item__logo} />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </div>
                </div>
            </div>
        </>
    )
}