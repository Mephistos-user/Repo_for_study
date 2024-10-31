import './App.css';
import { News } from './components/news/News';
import { Organs } from './components/organs/Organs';
import { Tabs } from './components/tabs/Tabs';

function App() {
  return (
    <>
      <div className="container">
        <Tabs />
        <h2 className="block__heading">Архив новостей</h2>
        <News />
        <h2 className="block__heading">Организации</h2>
        <Organs />
      </div>
    </>
  );
}

export default App;
