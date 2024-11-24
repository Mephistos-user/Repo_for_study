/**
 * Декораторы - это специальные функции, которые расширяют возможности тех функций, к которым они применены.
 * Данные сущьности могут быть классами, методами, свойствами, ацессорами (getters and setters) и параметрами.
 * Декораторы могут испольнятся до или после встраемоей функции. Могут быть использованы для Befor/After Call Hooks,
 *  т.е логики, которая может быть вызвана до или после вызова основной функции.
 */

/**
 * На декораторах построен фронтенд-фреймворк Angular, бэкенд-фреймворк NextJS, ORM Typeorm
 */

/** Angular */
@Component ({
    selector: 'app-product-alerts',
    templateUrl: './product-alerts.component.html',
    styleUrls: ['./product-alerts.component.css']
})
export class ProductAlertsComponent {}

/** Next JS */
import { Module } from '@nextjs/common';
import { CatsController } from './cats.controller';
import { CatsService } from './cats.service';

@Module ({
    controllers: [CatsController],
    providers: [CatsService],
    exports: [CatsService]
})
export class CatsModule {}

/** ORM Typeorm - популярная библиотека для работы с базами данных, которая позволяет преобразовывать SQL-запросы в объекты*/
import { Column, Entity, ManyToMany, PrimaryGeneratedColumn } from 'typeorm';

@Entity()
export class Category {
    @PrimaryGeneratedColumn()
    id: number;

    @Column()
    name: string;

    @ManyToMany((type) => Question, (question) => question.categories)
    questions: Question[];
}

/** Class Validator - популярная библиотека для валидации*/

import {
    Contains,
    IsDate,
    IsEmail,
    IsFQDN,
    IsInt,
    Length,
    Max,
    Min,
    validate,
    validateOrReject,
} from 'class-validator';

export class Post {
    @Length(10, 20)
    title: string;

    @Contains('example.com')
    text: string;

    @IsInt()
    @Min(10)
    @Max(100)
    rating: number;

    @IsEmail()
    email: string;

    @IsFQDN()
    website: string;

    @IsDate()
    createDate: Date;
}

let post = new Post();
post.title = 'This is a very long title';
post.text = 'This is a sample text. It contains an example.com link.';
post.rating = 50;
post.email = 'test@example.com';
post.website = 'example.com';
post.createDate = new Date();

validate(post).then(errors => {
    // errors is an array of validation errors
    if (errors.length > 0) {
        console.log('Validation failed:', errors);
    } else {
        console.log('Validation succeed!');
    }
});

validateOrReject(post).catch(errors => {
    // errors is an array of validation errors
    console.log('Promis rejected (validation failed). Errors: ', errors);
});
// or
async function validateOrRejectExample(input) {
    try {
        await validateOrReject(input);
    } catch (errors) {
        console.log('Caught promis rejected (validation failed). Errors: ', errors);
    }
}
