// import classes from './organs.module.scss';
// import { styles } from "./style";

import { StyledOrgansContainer, StyledOrgansCover, StyledOrgansItem, StyledOrgansLogo, StyledOrgansText } from "./style"

export const Organs = () => {
    // const classes = styles()

    return (
        <>
            <StyledOrgansContainer >
                <StyledOrgansItem >
                    <StyledOrgansCover ></StyledOrgansCover>
                    <StyledOrgansText >
                        <StyledOrgansLogo src="./logo192.png" alt=""  />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </StyledOrgansText>
                </StyledOrgansItem>
                <StyledOrgansItem >
                    <StyledOrgansCover ></StyledOrgansCover>
                    <StyledOrgansText >
                        <StyledOrgansLogo src="./logo192.png" alt=""  />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </StyledOrgansText>
                </StyledOrgansItem>
                <StyledOrgansItem >
                    <StyledOrgansCover ></StyledOrgansCover>
                    <StyledOrgansText >
                        <StyledOrgansLogo src="./logo192.png" alt=""  />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </StyledOrgansText>
                </StyledOrgansItem>
                <StyledOrgansItem >
                    <StyledOrgansCover ></StyledOrgansCover>
                    <StyledOrgansText >
                        <StyledOrgansLogo src="./logo192.png" alt=""  />
                        <h4 className="organs__item__title">Заголовок организации</h4>
                        <span className="organs__item__subtitle">Подзаголовок организации</span>
                    </StyledOrgansText>
                </StyledOrgansItem>
            </StyledOrgansContainer>
        </>
    )
}