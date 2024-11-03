import Button from "@mui/material/Button";
import { styled } from "@mui/material/styles";

export const StyledButton = styled(Button)(({theme}) => ({
    lineHeight: '20px',
    padding: '6px 12px',
    minHeight: 'auto',
    color: '#24292e',
    textTransform: 'none',
    fontWeight: 600,
    // '&svg': {
    //     fontSize: 16,
    //     marginLeft: -2,
    //     marginRight: -theme.spacing(0.5),
    // },
    '&.MuiButton-contained': {
        transision: 'none',
        boxShadow: 'none',
        border: '1px solid rgba(27, 31, 35, .2)',
        backgroundPosition: '-1px -1px',
        backgroundRepeat: 'repeat-x',
        backgroundSize: '110% 110%',
        backgroundColor: '#eff3f6',
        backgroundImage: 'linear-gradient(-180deg, #fafdfc, #eff3f6 90%)',
        '&:hover': {
            backgroundColor: '#e6ebf1',
            backgroundImage: 'linear-gradient(-180deg, #f0f3f6, #e6ebf1 90%)',
            backgroundPosition: '-0.5rem',
            borderColor: 'rgba(27, 31, 35, .35)',
            boxShadow: 'none',
        },
        '&:active': {
            backgroundColor: '#e9ecef',
            backgroundImage: 'none',
            backgroundPosition: '-0.5rem',
            borderColor: 'rgba(27, 31, 35, .35)',
            boxShadow: 'insert 0 0.15em 0.3em rgba(27, 31, 35, .15)',
        },
    },
    '&.MuiButton-containedPrimary': {
        color: theme.palette.common.white,
        backgroundColor: '#28a745',
        backgroundImage: 'linear-gradient(-180deg, #34d058, #28a745 90%)',
        '&:hover': {
            backgroundColor: '#269f42',
            backgroundImage: 'linear-gradient(-180deg, #2fcb53, #269f42 90%)',
        },
        '&:active': {
            backgroundColor: '#279f43',
            borderColor: 'rgba(27, 31, 35, .35)',
        },
    },
}))