(ns org.ansj.app.crf.SplitWord
  "分词"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.crf SplitWord]))

(defn ->split-word
  "Constructor.

  model - `org.ansj.app.crf.Model`"
  (^SplitWord [^org.ansj.app.crf.Model model]
    (new SplitWord model)))

(defn cut
  "chars - `char[]`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SplitWord this chars]
    (-> this (.cut chars))))

(defn cohesion
  "随便给一个词。计算这个词的内聚分值，可以理解为计算这个词的可信度

  word - `java.lang.String`

  returns: `float`"
  (^Float [^SplitWord this ^java.lang.String word]
    (-> this (.cohesion word))))

