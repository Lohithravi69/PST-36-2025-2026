
function Button(){
    const styles={
        margin: "10px",
        backgroundColor: "hsl(114, 58%, 64%)",
        color: "white",
        border: "none",
        padding: "10px 20px",
        textAlign: "center",
        textDecoration: "none",
        display: "inline-block",
        cursor: "pointer",
        borderRadius: "5px"
    }
    return(
        <button style={styles}>Click me</button>);
}
export default Button;