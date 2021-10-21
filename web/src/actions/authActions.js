

export const LOGIN = 'LOGIN'
export const LOGOUT = 'LOGOUT'

export const login = (email, uid, photoURL) => ({ type: LOGIN, payload: {email,photoURL, uid} })

export const logout = () => ({
    type: LOGOUT
});








