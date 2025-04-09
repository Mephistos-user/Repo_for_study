<?php
trait Timestampable {
    private $createdAt;
    private $updatedAt;
    
    public function getCreatedAt() {
        return $this->createdAt;
    }
    public function setCreatedAt($createdAt) {
        $this->createdAt = $createdAt;
    }
    public function getUpdatedAt() {
        return $this->updatedAt;
    }
    public function setUpdatedAt($updatedAt) {
        $this->updatedAt = $updatedAt;
    }
}

class Post {
    use Timestampable;
    private $title;
    private $content;
    public function __construct($title, $content) {
        $this->title = $title;
        $this->content = $content;
        $this->setCreatedAt(new DateTime());
        $this->setUpdatedAt(new DateTime());
    }
}

$post = new Post("Заголовок", "Содержимое поста");
echo $post->getCreatedAt()->format('Y-m-d H:i:s');// Выведет текущую дату и время