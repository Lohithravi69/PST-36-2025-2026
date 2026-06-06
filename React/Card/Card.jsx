import profile from './assets/hero.png'
function Card(){
    return(
        <div className="Card">
            <img alt="profile picture" className="Card-image" src={profile}></img>
            <h2 className="Card-title">Lohith</h2>
            <p className="Card-text">Full Stack Developer</p>

        </div>
    );
}
export default Card;