(ns org.ansj.util.MathUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.util MathUtil]))

(defn ->math-util
  "Constructor."
  (^MathUtil []
    (new MathUtil )))

(defn *compu-score
  "从一个词的词性到另一个词的词的分数

  from - `org.ansj.domain.Term`
  to - 后面的词 - `org.ansj.domain.Term`
  relation-map - `java.util.Map`

  returns: 分数 - `double`"
  (^Double [^org.ansj.domain.Term from ^org.ansj.domain.Term to ^java.util.Map relation-map]
    (MathUtil/compuScore from to relation-map)))

(defn *compu-score-freq
  "词性词频词长.计算出来一个分数

  from - `org.ansj.domain.Term`
  term - `org.ansj.domain.Term`

  returns: `double`"
  (^Double [^org.ansj.domain.Term from ^org.ansj.domain.Term term]
    (MathUtil/compuScoreFreq from term)))

(defn *compu-nature-freq
  "两个词性之间的分数计算

  from - `org.ansj.recognition.impl.NatureRecognition$NatureTerm`
  to - `org.ansj.recognition.impl.NatureRecognition$NatureTerm`

  returns: `double`"
  (^Double [^org.ansj.recognition.impl.NatureRecognition$NatureTerm from ^org.ansj.recognition.impl.NatureRecognition$NatureTerm to]
    (MathUtil/compuNatureFreq from to)))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (MathUtil/main args)))

