import { AppDataSource } from "../data-source";
import { User } from "../entity/User";

const userRepository = AppDataSource.getRepository(User);

export const getUsers = async (): Promise<User []> => {
    const users = await userRepository.find();
    console.log('users: ', users);
    return users;
};