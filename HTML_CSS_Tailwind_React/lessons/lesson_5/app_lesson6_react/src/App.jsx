import './App.scss';
import { News } from './components/news/News';
import { Organs } from './components/organs/Organs';
import { Tabs } from './components/tabs/Tabs';
import { StyledContainer, StyledHeading } from './style';

function App() {
  return (
    <>
      <StyledContainer >
        <Tabs />
        <StyledHeading >Архив новостей</StyledHeading>
        <News />
        <StyledHeading >Организации</StyledHeading>
        <Organs />
      </StyledContainer>
    </>
  );
}

export default App;
