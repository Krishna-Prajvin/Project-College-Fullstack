import { CartIcon } from '../icons';
const Navbar = () => {
  return (
    <>
      <nav>
        <div className='nav-center'>
          <h3>This is a NavBar component</h3>
          <div className='nav-container'>
            <CartIcon />
            <div className='amount-container'>
              <p className='total-amount'>₹ 0</p>
            </div>
          </div>
        </div>
      </nav>
    </>
  );
};
export default Navbar;
