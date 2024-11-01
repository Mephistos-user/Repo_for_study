// import classes from './news.module.scss';
// import { styles } from "./style";
import { StyledNewsContainer, StyledNewsImage } from "./style"

export const News = () => {
    // const classes = styles()

    return (
        <>
            <StyledNewsContainer >
                <div className="news__item">
                    <StyledNewsImage src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <StyledNewsImage src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <StyledNewsImage src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <StyledNewsImage src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <StyledNewsImage src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
                <div className="news__item">
                    <StyledNewsImage src="./logo192.png" alt="" />
                    <h4 className="news__item__title">Заголовок новости</h4>
                    <span className="news__item__subtitle">Подзаголовок новости</span>
                </div>
            </StyledNewsContainer>
        </>
    )
}