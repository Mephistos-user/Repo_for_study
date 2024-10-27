/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./index.html"],
  theme: {
    extend: {
      screens: {
        "mobile": "540px",
        "tablet": "768px",
        "laptop": "1024px",
        "desktop": "1280px"
      },
      colors: {
        "super-red": "#c11111"
      },
      fontFamily: {
        "sans": "Montserrat"
      }
    },
  },
  plugins: ['@tailwindcss/container-queries'],
}

