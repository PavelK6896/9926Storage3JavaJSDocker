
const url1 = 'http://localhost:8081'
const url3 = 'http://localhost:8083'

export const getUser = async () => {
   return fetch(url1).then((d) => d.json())
}

export const getUser3 = async () => {
   return fetch(url3 + '/api/user').then((d) => d.json())
}

