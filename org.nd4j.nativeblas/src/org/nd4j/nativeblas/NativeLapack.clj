(ns org.nd4j.nativeblas.NativeLapack
  "Created by agibsonccc on 2/20/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas NativeLapack]))

(defn ->native-lapack
  "Constructor."
  (^NativeLapack []
    (new NativeLapack )))

(defn dgetrf
  "LU decomposiiton of a matrix

  extra-pointers - `long[]`
  m - `int`
  n - `int`
  a - `long`
  lda - `int`
  ipiv - `int[]`
  info - `int`"
  ([^NativeLapack this extra-pointers ^Integer m ^Integer n ^Long a ^Integer lda ipiv ^Integer info]
    (-> this (.dgetrf extra-pointers m n a lda ipiv info))))

(defn dgetri
  "Generate inverse ggiven LU decomp

  extra-pointers - `long[]`
  n - `int`
  a - `long`
  lda - `int`
  ipiv - `int[]`
  work - `long`
  lwork - `int`
  info - `int`"
  ([^NativeLapack this extra-pointers ^Integer n ^Long a ^Integer lda ipiv ^Long work ^Integer lwork ^Integer info]
    (-> this (.dgetri extra-pointers n a lda ipiv work lwork info))))

(defn sgetrf
  "LU decomposiiton of a matrix

  extra-pointers - `long[]`
  m - `int`
  n - `int`
  a - `long`
  lda - `int`
  ipiv - `int[]`
  info - `int`"
  ([^NativeLapack this extra-pointers ^Integer m ^Integer n ^Long a ^Integer lda ipiv ^Integer info]
    (-> this (.sgetrf extra-pointers m n a lda ipiv info))))

(defn sgetri
  "Generate inverse ggiven LU decomp

  extra-pointers - `long[]`
  n - `int`
  a - `long`
  lda - `int`
  ipiv - `int[]`
  work - `long`
  lwork - `int`
  info - `int`"
  ([^NativeLapack this extra-pointers ^Integer n ^Long a ^Integer lda ipiv ^Long work ^Integer lwork ^Integer info]
    (-> this (.sgetri extra-pointers n a lda ipiv work lwork info))))

