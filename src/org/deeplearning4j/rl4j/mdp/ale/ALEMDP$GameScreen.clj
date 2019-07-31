(ns org.deeplearning4j.rl4j.mdp.ale.ALEMDP$GameScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.ale ALEMDP$GameScreen]))

(defn ->game-screen
  "Constructor.

  screen - `byte[]`"
  (^ALEMDP$GameScreen [screen]
    (new ALEMDP$GameScreen screen)))

(defn to-array
  "Description copied from interface: Encodable

  returns: the encoded informations - `double[]`"
  ([^ALEMDP$GameScreen this]
    (-> this (.toArray))))

