(ns vizdoom.GameState
  (:refer-clojure :only [require comment defn ->])
  (:import [vizdoom GameState]))

(defn number
  "Instance Field.

  type: int"
  (^Integer [^GameState this]
    (-> this .-number)))

(defn tic
  "Instance Field.

  type: int"
  (^Integer [^GameState this]
    (-> this .-tic)))

(defn game-variables
  "Instance Field.

  type: double[]"
  ([^GameState this]
    (-> this .-gameVariables)))

(defn screen-buffer
  "Instance Field.

  type: byte[]"
  ([^GameState this]
    (-> this .-screenBuffer)))

(defn depth-buffer
  "Instance Field.

  type: byte[]"
  ([^GameState this]
    (-> this .-depthBuffer)))

(defn labels-buffer
  "Instance Field.

  type: byte[]"
  ([^GameState this]
    (-> this .-labelsBuffer)))

(defn automap-buffer
  "Instance Field.

  type: byte[]"
  ([^GameState this]
    (-> this .-automapBuffer)))

(defn labels
  "Instance Field.

  type: vizdoom.Label[]"
  ([^GameState this]
    (-> this .-labels)))

