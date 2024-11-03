import { Box } from "@mui/material";
import React from "react";
import { StyledTab, StyledTabs } from './style';

const AppleTabs = () => {
    const [tabIndex, setTabIndex] =React.useState(0);
    return (
        <Box sx={{
            padding: '30px',
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
            gap: '10px',
        }}>
            <StyledTabs 
                value={tabIndex}
                onChange={(e, index) => setTabIndex(index)}
            >
                <StyledTab disableRipple label={'All'} />
                <StyledTab disableRipple label={'Missed'} />
                <StyledTab disableRipple label={'Calls'} />
            </StyledTabs>
        </Box>
    );
};

export default AppleTabs;