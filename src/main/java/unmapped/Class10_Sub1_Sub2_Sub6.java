package unmapped;

import jagex2.config.SpotAnimType;
import jagex2.dash3d.entity.Entity;
import jagex2.graphics.Model;

public final class Class10_Sub1_Sub2_Sub6 extends Entity {
   private int anInt628;
   private SpotAnimType aClass28_2;
   private boolean aBoolean155 = true;
   public int anInt623;
   public boolean aBoolean156 = false;
   private int anInt627;
   public int anInt629;
   public int anInt624;
   public int anInt625;
   public int anInt626;

   public Class10_Sub1_Sub2_Sub6(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass28_2 = SpotAnimType.aClass28Array1[var5];
      this.anInt623 = var2;
      this.anInt624 = var1;
      this.anInt625 = var7;
      this.anInt626 = var3;
      this.anInt629 = var6 + var4;
      this.aBoolean156 = false;
   }

   protected Model method537(byte var1) {
      if (var1 != 3) {
         throw new NullPointerException();
      } else {
         Model var2 = this.aClass28_2.method352();
         if (var2 == null) {
            return null;
         } else {
            int var3 = this.aClass28_2.aClass15_1.anIntArray47[this.anInt627];
            Model var4 = new Model(false, false, true, var2, Class22.method169(this.aBoolean155, var3));
            if (!this.aBoolean156) {
               var4.method278();
               var4.method279(var3, (byte)6);
               var4.anIntArrayArray11 = null;
               var4.anIntArrayArray10 = null;
            }

            if (this.aClass28_2.anInt438 != 128 || this.aClass28_2.anInt439 != 128) {
               var4.method287(this.aClass28_2.anInt439, this.aClass28_2.anInt438, this.aClass28_2.anInt438);
            }

            if (this.aClass28_2.anInt440 != 0) {
               if (this.aClass28_2.anInt440 == 90) {
                  var4.method282();
               }

               if (this.aClass28_2.anInt440 == 180) {
                  var4.method282();
                  var4.method282();
               }

               if (this.aClass28_2.anInt440 == 270) {
                  var4.method282();
                  var4.method282();
                  var4.method282();
               }
            }

            var4.method288(this.aClass28_2.anInt441 + 64, this.aClass28_2.anInt442 + 850, -30, -50, -30, true);
            return var4;
         }
      }
   }

   public void method420(byte var1, int var2) {
      this.anInt628 += var2;
      boolean var3 = false;

      while(true) {
         do {
            do {
               if (this.anInt628 <= this.aClass28_2.aClass15_1.method97(this.anInt627)) {
                  return;
               }

               this.anInt628 -= this.aClass28_2.aClass15_1.method97(this.anInt627);
               ++this.anInt627;
            } while(this.anInt627 < this.aClass28_2.aClass15_1.anInt152);
         } while(this.anInt627 >= 0 && this.anInt627 < this.aClass28_2.aClass15_1.anInt152);

         this.anInt627 = 0;
         this.aBoolean156 = true;
      }
   }
}
