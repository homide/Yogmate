package com.project.yogmate;

import android.content.Context;

public class InsertAnatomyData {
    Context context;
    InsertAnatomyData(Context context){
        this.context = context;
        insertAllData();
    }

    public void insertAllData(){
        DataHelper dbh = new DataHelper(context);

        //0
        dbh.insertAnatomy("Abs", "https://images.unsplash.com/photo-1577221084712-45b0445d2b00?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        dbh.insertPose("Boat Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_1240/MTQ3MTUyNzM1MjQ1MTgyNDE0/boathp_292_8_bjk.webp",0);
        dbh.insertDetails(0,"Boat Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_1240/MTQ3MTUyNzM1MjQ1MTgyNDE0/boathp_292_8_bjk.webp","An ab and deep hip flexor strengthener, Paripurna Navasana requires you to balance on the tripod of your sitting bones and tailbone.");
        dbh.insertSteps(0,"Sit on the floor with your legs straight in front of you. Press your hands on the floor a little behind your hips, fingers pointing toward the feet, and strengthen the arms. Lift through the top of the sternum and lean back slightly. As you do this make sure your back doesn't round; continue to lengthen the front of your torso between the pubis and top sternum. Sit on the tripod of your two sitting bones and tailbone.");
        dbh.insertSteps(0,"Exhale and bend your knees, then lift your feet off the floor, so that the thighs are angled about 45-50 degrees relative to the floor. Lengthen your tailbone into the floor and lift your pubis toward your navel. If possible, slowly straighten your knees, raising the tips of your toes slightly above the level of your eyes. If this isn't possible remain with your knees bent, perhaps lifting the shins parallel to the floor.");
        dbh.insertSteps(0,"Stretch your arms alongside the legs, parallel to each other and the floor. Spread the shoulder blades across your back and reach strongly out through the fingers. If this isn't possible, keep the hands on the floor beside your hips or hold on to the backs of your thighs.");
        dbh.insertSteps(0,"While the lower belly should be firm, it shouldn't get hard and thick. Try to keep the lower belly relatively flat. Press the heads of the thigh bones toward the floor to help anchor the pose and lift the top sternum. Breathe easily. Tip the chin slightly toward the sternum so the base of the skull lifts lightly away from the back of the neck.");
        dbh.insertSteps(0,"At first stay in the pose for 10-20 seconds. Gradually increase the time of your stay to 1 minute. Release the legs with an exhalation and sit upright on an inhalation.");
        dbh.insertBenefits(0,"Strengthens the abdomen, hip flexors, and spine.");
        dbh.insertBenefits(0,"Stimulates the kidneys, thyroid and prostate glands, and intestines.");
        dbh.insertBenefits(0,"Helps relieve stress");
        dbh.insertBenefits(0,"Improves digestion");

        dbh.insertPose("Bridge Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_1240/MTQ3MTc0Njc5MDM4MTQxOTAy/2hp_286_0621_bjk.webp",0 );
        dbh.insertDetails(1,"Bridge Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_1240/MTQ3MTc0Njc5MDM4MTQxOTAy/2hp_286_0621_bjk.webp","Bridge Pose can be whatever you need—energizing, rejuvenating, or luxuriously restorative.");
        dbh.insertSteps(1,"Lie supine on the floor, and if necessary, place a thickly folded blanket under your shoulders to protect your neck. Bend your knees and set your feet on the floor, heels as close to the sitting bones as possible.");
        dbh.insertSteps(1,"Exhale and, pressing your inner feet and arms actively into the floor, push your tailbone upward toward the pubis, firming (but not hardening) the buttocks, and lift the buttocks off the floor. Keep your thighs and inner feet parallel. Clasp the hands below your pelvis and extend through the arms to help you stay on the tops of your shoulders.");
        dbh.insertSteps(1,"Lift your buttocks until the thighs are about parallel to the floor. Keep your knees directly over the heels, but push them forward, away from the hips, and lengthen the tailbone toward the backs of the knees. Lift the pubis toward the navel.");
        dbh.insertSteps(1,"Lift your chin slightly away from the sternum and, firming the shoulder blades against your back, press the top of the sternum toward the chin. Firm the outer arms, broaden the shoulder blades, and try to lift the space between them at the base of the neck (where it's resting on the blanket) up into the torso.");
        dbh.insertSteps(1,"Stay in the pose anywhere from 30 seconds to 1 minute. Release with an exhalation, rolling the spine slowly down onto the floor.");
        dbh.insertBenefits(1,"Stretches the chest, neck, and spine");
        dbh.insertBenefits(1,"Calms the brain and helps alleviate stress and mild depression");
        dbh.insertBenefits(1,"Improves digestion");
        dbh.insertBenefits(1,"Stimulates abdominal organs, lungs, and thyroid");


    }
}
