
const url1 = 'http://localhost:8081'

export const getUser = async () => {
   return fetch(url1).then((d) => d.json())
}


