/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_vb_media_mp3_lame_LameInterface */

#ifndef _Included_org_vb_media_mp3_lame_LameInterface
#define _Included_org_vb_media_mp3_lame_LameInterface
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_vb_media_mp3_lame_LameInterface
 * Method:    initLame
 * Signature: (IIIII)I
 */
JNIEXPORT jint JNICALL Java_org_vb_media_mp3_lame_LameInterface_initLame
  (JNIEnv *, jclass, jint, jint, jint, jint, jint);

/*
 * Class:     org_vb_media_mp3_lame_LameInterface
 * Method:    encodeBuffer
 * Signature: ([S[SI[B)I
 */
JNIEXPORT jint JNICALL Java_org_vb_media_mp3_lame_LameInterface_encodeBuffer
  (JNIEnv *, jclass, jshortArray, jshortArray, jint, jbyteArray);

/*
 * Class:     org_vb_media_mp3_lame_LameInterface
 * Method:    encodeFlush
 * Signature: ([B)I
 */
JNIEXPORT jint JNICALL Java_org_vb_media_mp3_lame_LameInterface_encodeFlush
  (JNIEnv *, jclass, jbyteArray);

/*
 * Class:     org_vb_media_mp3_lame_LameInterface
 * Method:    close
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_vb_media_mp3_lame_LameInterface_close
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
