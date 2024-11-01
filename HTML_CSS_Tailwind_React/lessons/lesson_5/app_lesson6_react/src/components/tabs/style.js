// стилизация с помощью style-components
// npm install styled-components
import styled from 'styled-components'

export const StyledTabsContainer = styled.div`
    display: flex;
    flex-wrap: wrap;
    gap: 15px;
    align-items: center;
`
export const StyledTabsItem = styled.button`
    font-size: 14px;
    border-radius: 27px;
    padding: 13px 34px;
    border: 1px solid white;
    background: transparent;
    color: inherit;
`

// стилизация с помощью JSS
// npm install react-jss
// import { createUseStyles } from 'react-jss'

// export const styles = createUseStyles ({
//     container: {
//         display: 'flex',
//         flexWrap: 'wrap',
//         gap: 15,
//         alignItems: 'center'
//     },
//     item: {
//         fontSize: 14,
//         borderRadius: 27,
//         padding: '13px 34px',
//         border: '1px solid white',
//         backgroundColor: 'transparent',
//         color: 'inherit'
//     }
// })