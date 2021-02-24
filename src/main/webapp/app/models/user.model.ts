﻿import { Role } from "./role.model";

export class User {
    id:string;
    name: string;
    firstName?: string;
    lastName?: string;
    email: string;
    verification: string;
    verified: boolean;
    authorities: [Role];
    password?: string;
    orders?: object;
    confirmPassword?: string;
    photoURL?: string;
    id_token: string;

}
