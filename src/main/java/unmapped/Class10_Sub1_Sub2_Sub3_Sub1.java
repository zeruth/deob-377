package unmapped;

import jagex2.dash3d.entity.PathingEntity;
import jagex2.graphics.Model;

public final class Class10_Sub1_Sub2_Sub3_Sub1 extends PathingEntity {
   public Class38 aClass38_1;
   private boolean aBoolean131 = true;

   private Model method386() {
      int var1;
      if (super.anInt753 >= 0 && super.anInt756 == 0) {
         var1 = Class15.aClass15Array1[super.anInt753].anIntArray47[super.anInt754];
         int var2 = -1;
         if (super.anInt719 >= 0 && super.anInt719 != super.anInt760) {
            var2 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
         }

         return this.aClass38_1.method405(var1, var2, Class15.aClass15Array1[super.anInt753].anIntArray50);
      } else {
         var1 = -1;
         if (super.anInt719 >= 0) {
            var1 = Class15.aClass15Array1[super.anInt719].anIntArray47[super.anInt720];
         }

         return this.aClass38_1.method405(var1, -1, (int[])null);
      }
   }

   protected Model method537(byte var1) {
      if (var1 != 3) {
         throw new NullPointerException();
      } else {
         boolean var2 = false;
         if (this.aClass38_1 == null) {
            return null;
         } else {
            Model var3 = this.method386();
            if (var3 == null) {
               return null;
            } else {
               super.anInt723 = var3.anInt713;
               if (super.anInt743 != -1 && super.anInt744 != -1) {
                  Class28 var4 = Class28.aClass28Array1[super.anInt743];
                  Model var5 = var4.method352();
                  if (var5 != null) {
                     int var6 = var4.aClass15_1.anIntArray47[super.anInt744];
                     Model var7 = new Model(false, false, true, var5, Class22.method169(this.aBoolean131, var6));
                     var7.method284(0, 0, -super.anInt747);
                     var7.method278();
                     var7.method279(var6, (byte)6);
                     var7.anIntArrayArray11 = null;
                     var7.anIntArrayArray10 = null;
                     if (var4.anInt438 != 128 || var4.anInt439 != 128) {
                        var7.method287(var4.anInt439, var4.anInt438, var4.anInt438);
                     }

                     var7.method288(var4.anInt441 + 64, var4.anInt442 + 850, -30, -50, -30, true);
                     Model[] var8 = new Model[]{var3, var7};
                     var3 = new Model(2, true, 0, var8);
                  }
               }

               if (this.aClass38_1.aByte31 == 1) {
                  var3.aBoolean106 = true;
               }

               return var3;
            }
         }
      }
   }

   public boolean isVisible() {
      return this.aClass38_1 != null;
   }
}
