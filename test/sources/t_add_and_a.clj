(ns sources.t-add-and-a
  (:use midje.sweet))

(load-file "sources/add-and-a.clj")

(fact
  (Point 1 2) => {:x 1 :y 2 :__class_symbol__ 'Point}
  (let [new-point (shift (Point 1 2) 1 2)]
    (:x new-point) => 2
    (:y new-point) => 4))
  
