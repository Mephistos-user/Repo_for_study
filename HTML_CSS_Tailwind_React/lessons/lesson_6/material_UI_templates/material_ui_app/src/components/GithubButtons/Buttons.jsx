import Box from "@mui/material/Box";
import React from "react";
import { StyledButton } from './style';

const GithubButtons = () => {
    return (
        <Box sx={{
            padding: '30px',
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
            gap: '10px'
        }}>
            <StyledButton variant="contained" color="inherit">Default</StyledButton>
            <StyledButton variant="contained" color="primary">Contained</StyledButton>
        </Box>
    );
};

export default GithubButtons;