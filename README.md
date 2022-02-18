# MP3 voice recorder library for Android.

## Technical term
* The library uses [LAME MP3 encoder](http://lame.sourceforge.net/).
* The library is builded with Android NDK as a shared library and called JNI from the application.

## Modifications to the original LAME library
Modifications made just for Android NDK compatibility purpose.
Source code goes from libmp3lame folder of original library sources bundle. It is in ./jni/lame-3.100_libmp3lame folder in the project.

1. Remove Makefile.am, Makefile.in, libmp3lame_dll_vc6.dsp, libmp3lame_vc6.dsp, libmp3lame_vc8.vcproj, logoe.ico, depcomp, i386 directory and vector directory.

2. Edit file jni/lame-3.100_libmp3lame/utils.h, and replace definition "extern ieee754_float32_t fast_log2(ieee754_float32_t x);" with this "extern float fast_log2(float x);".

## Build of the library
Run ./build.sh. Libraries will be in ./libs folder.
 
## License
[License inherits]() from original LAME Project.
### LAME
LAME source code licensed under the [LGPL]().