// стилизация с помощью styled-components
// npm install styled-components
import styled from 'styled-components'

export const StyledNewsContainer = styled.div`
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    gap: 15px;
`
export const StyledNewsImage = styled.img`
    max-width: 100%;
    height: 185px;
    object-fit: cover;
`

// стилизация с помощью JSS
// npm install react-jss
// import { createUseStyles } from 'react-jss'

// export const styles = createUseStyles ({
//     container: {
//         display: 'grid',
//         gridTemplateColumns: '1fr 1fr 1fr',
//         gap: 15
//     },
//     item__image: {
//         maxWidth: '100%',
//         height: 185,
//         objectFit: 'cover'
//     }
// })