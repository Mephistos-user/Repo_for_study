import { Link, Route, Routes } from 'react-router-dom';
import About from './About/About';
import './App.css';
import Contacts from './Contacts/Contacts';
import Home from './Home/Home';

function App() {
  return (
    <div className="App">
        <div className='router-nav-container'>
          <nav className='navigation-menu'>
            <div className='navigation-menu__container'>
              <div>
                <Link to='/home' className='link'>Домой</Link>
              </div>
              <div>
                <Link to='/about' className='link'>О нас</Link>
              </div>
              <div>
                <Link to='/contacts' className='link'>Контакты</Link>
              </div>
            </div>
          </nav>
        </div>
        <Routes>
          <Route path='/home' element={<Home />} />
          <Route path='/about' element={<About />} />
          <Route path='/contacts' element={<Contacts />} />
        </Routes>
    </div>
  );
}

export default App;
