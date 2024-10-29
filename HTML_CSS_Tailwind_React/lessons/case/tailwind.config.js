/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./index.html", "./src/**/*.png"],
  theme: {
    extend: {
      fontFamily: {
        "sans": ["Montserrat"]
      },
      colors: {
        "superRed": "#FF2D3D",
        "superGray": "#96999D",
      }
    },
  },
  plugins: [],
}

