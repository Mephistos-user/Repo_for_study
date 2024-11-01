// стилизация с помощью styled-components
// npm install styled-components
import styled from 'styled-components'

export const StyledOrgansContainer = styled.div`
    display: grid;
    grid-template-columns: 1fr 1fr;
    gap: 15px;
`
export const StyledOrgansItem = styled.div`
    padding-bottom: 10px;
    margin-bottom: -60px;
`

export const StyledOrgansCover = styled.div`
    max-width: 100%;
    height: 120px;
    background-color: #d9d9d9;
`
export const StyledOrgansLogo = styled.img`
    width: 140px;
    height: 140px;
    object-fit: cover;
`
export const StyledOrgansText = styled.div`
    position: relative;
    bottom: 80px;
    left: 30px;
`

// стилизация с помощью JSS
// npm install react-jss
// import { createUseStyles } from 'react-jss'

// export const styles = createUseStyles ({
//     container: {
//         display: 'grid',
//         gridTemplateColumns: '1fr 1fr',
//         gap: 15,
//     },
//     item: {
//     paddingBottom: 10,
//     marginBottom: '-60px',
//     },
//     item__cover: {
//         maxWidth: '100%',
//         height: 120,
//         backgroundColor: '#d9d9d9',
//     },
//     item__logo: {
//         width: 140,
//         height: 140,
//         objectFit: 'cover',
//     },
//     text: {
//         position: 'relative',
//         bottom: 80,
//         left: 30,
//     }
// })