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

        dbh.insertPose("Dolphin Plank Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_620/MTQ3MTU3Mjg5NTIwODY3MTE5/3anatomy_287_3356_bjk.webp",0 );
        dbh.insertDetails(2,"Dolphin Plank Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_620/MTQ3MTU3Mjg5NTIwODY3MTE5/3anatomy_287_3356_bjk.webp","A modification of Plank Pose, Dolphin Plank Pose strengthens and tones the core, thighs, and arms.");
        dbh.insertSteps(2,"Start in Dolphin Pose, knees bent. Then walk your feet back until your shoulders are directly over the elbows and your torso is parallel to the floor.");
        dbh.insertSteps(2,"Press your inner forearms and elbows firmly against the floor. Firm your shoulder blades against your back and spread them away from the spine. Similarly spread your collarbones away from the sternum.");
        dbh.insertSteps(2,"Press your front thighs toward the ceiling, but resist your tailbone toward the floor as you lengthen it toward the heels. Lift the base of your skull away from the back of the neck and look straight down at the floor, keeping the throat and eyes soft.");
        dbh.insertSteps(2,"Stay anywhere from 30 seconds to a minute. Then, release your knees to the floor with an exhale.");
        dbh.insertBenefits(2,"Calms the brain and helps relieve stress and mild depression");
        dbh.insertBenefits(2,"Stretches the shoulders, hamstrings, calves, and arches");
        dbh.insertBenefits(2,"Strengthens the arms and legs, and core");
        dbh.insertBenefits(2,"Helps prevent osteoporosis");

        dbh.insertPose("Extended Puppy Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_620/MTQ3MTU3MjQ0NDIzNzEwMTU4/3yp_287_6641_gn_bjk.webp",0 );
        dbh.insertDetails(3,"Extended Puppy Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_620/MTQ3MTU3MjQ0NDIzNzEwMTU4/3yp_287_6641_gn_bjk.webp","A cross between Child's Pose and Downward-Facing Dog, Extended Puppy Pose lengthens the spine and calms the mind.");
        dbh.insertSteps(3,"Come onto all fours. See that your shoulders are above your wrists and your hips are above your knees. Walk your hands forward a few inches and curl your toes under.");
        dbh.insertSteps(3,"As you exhale, move your buttocks halfway back toward your heels. Keep your arms active; don't let your elbows touch the ground.");
        dbh.insertSteps(3,"Drop your forehead to the floor or to a blanket and let your neck relax. Keep a slight curve in your lower back. To feel a nice long stretch in your spine, press the hands down and stretch through the arms while pulling your hips back toward your heels.");
        dbh.insertSteps(3,"Breathe into your back, feeling the spine lengthen in both directions. Hold for 30 seconds to a minute, then release your buttocks down onto your heels.");
        dbh.insertBenefits(3,"Stretches the spine and shoulders");


        dbh.insertPose("Extended Side Angle Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_620/MTQ3MTU0OTQxNTE1OTMzMTM0/2hp_291_1875_gn_bjk.webp",0 );
        dbh.insertDetails(4,"Extended Side Angle Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_620/MTQ3MTU0OTQxNTE1OTMzMTM0/2hp_291_1875_gn_bjk.webp","Find length in your side body, from your heel to your fingertips with Extended Side Angle Pose.");
        dbh.insertSteps(4,"Stand in Tadasana. On an exhalation, step or lightly jump your feet 3.5 to 4 feet apart. Raise your arms parallel to the floor and reach them actively out to the sides, shoulder blades wide, palms down. Turn your left foot in slightly to the right and your right foot out to the right 90 degrees. Align the right heel with the left heel. Firm your thighs and turn your right thigh outward, so that the center of the kneecap is in line with the center of the right ankle. Roll the left hip slightly forward, toward the right, but rotate your upper torso back to the left.");
        dbh.insertSteps(4,"Anchor the left (back) heel to the floor by lifting the inner left groin deep into the pelvis. Then exhale and bend your right knee over the right ankle, so that the shin is perpendicular to the floor. As you bend the knee aim the inner knee toward the little-toe side of the foot. If possible, bring the right thigh parallel to the floor.");
        dbh.insertSteps(4,"Firm your shoulder blades against the back ribs. Extend your left arm straight up toward the ceiling, then turn the left palm to face toward your head and with an inhalation reach the arm over the back of your left ear, palm facing the floor. Stretch from your left heel through your left fingertips, lengthening the entire left side of your body. Turn your head to look at the left arm. Release your right shoulder away from the ear. Try to create as much length along the right side of your torso as you do along the left.");
        dbh.insertSteps(4,"As you continue to ground your left heel to the floor, exhale and lay the right side of your torso down onto (or bring it as close as possible to) the top of the right thigh. Press your right fingertips (or palm) on the floor just outside of your right foot. Actively push the right knee back against the inner arm; counter this by burrowing your tail bone into the back of your pelvis, toward the pubis. The inside of your right thigh should be parallel with the long edge of your sticky mat.");
        dbh.insertSteps(4,"Stay for 30 seconds to 1 minute. Inhale to come up. Push both heels strongly into the floor and reach the left arm forcefully toward the ceiling to lighten the upward movement. Reverse the feet and repeat for the same length of time to the left. Then come up and return to Tadasana.");
        dbh.insertBenefits(4,"Strengthens and stretches the legs, knees, and ankles");
        dbh.insertBenefits(4,"Stretches the groins, spine, waist, chest and lungs, and shoulders");
        dbh.insertBenefits(4,"Stimulates abdominal organs");
        dbh.insertBenefits(4,"Increases stamina");


        dbh.insertPose("Extended Triangle Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTc3OTY2Mjk4NzM2NDMx/2yp_285_1643_prf.webp",0);
        dbh.insertDetails(5,"Extended Triangle Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTc3OTY2Mjk4NzM2NDMx/2yp_285_1643_prf.webp", "Extended Triangle Pose is the quintessential standing pose in many styles of yoga.");
        dbh.insertSteps(5, "Stand in Tadasana. With an exhalation, step or lightly jump your feet 3 1/2 to 4 feet apart. Raise your arms parallel to the floor and reach them actively out to the sides, shoulder blades wide, palms down.");
        dbh.insertSteps(5, "Turn your left foot in slightly to the right and your right foot out to the right 90 degrees. Align the right heel with the left heel. Firm your thighs and turn your right thigh outward, so that the center of the right knee cap is in line with the center of the right ankle.");
        dbh.insertSteps(5, "Exhale and extend your torso to the right directly over the plane of the right leg, bending from the hip joint, not the waist. Anchor this movement by strengthening the left leg and pressing the outer heel firmly to the floor. Rotate the torso to the left, keeping the two sides equally long. Let the left hip come slightly forward and lengthen the tailbone toward the back heel.");
        dbh.insertSteps(5, "Rest your right hand on your shin, ankle, or the floor outside your right foot, whatever is possible without distorting the sides of the torso. Stretch your left arm toward the ceiling, in line with the tops of your shoulders. Keep your head in a neutral position or turn it to the left, eyes gazing softly at the left thumb.");
        dbh.insertSteps(5, "Stay in this pose for 30 seconds to 1 minute. Inhale to come up, strongly pressing the back heel into the floor and reaching the top arm toward the ceiling. Reverse the feet and repeat for the same length of time to the left.");
        dbh.insertBenefits(5, "Stretches and strengthens the thighs, knees, and ankles");
        dbh.insertBenefits(5, "Stretches the hips, groins, hamstrings, and calves; shoulders, chest, and spine");
        dbh.insertBenefits(5, "Stimulates the abdominal organs");
        dbh.insertBenefits(5, "Helps relieve stress");


        dbh.insertPose("Four-Limbed Staff Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTUyNzM1MjQ1MjQ4MzAz/chaturangahp2_292_37434_cmyk.webp",0);
        dbh.insertDetails(6,"Four-Limbed Staff Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTUyNzM1MjQ1MjQ4MzAz/chaturangahp2_292_37434_cmyk.webp", "Learn four-limbed staff pose because it is frequently practiced as part of the traditional Sun Salutation sequence.");
        dbh.insertSteps(6, "Perform Adho Mukha Svanasana, then Plank Pose. Firm your shoulder blades against your back ribs and press your tailbone toward your pubis.");
        dbh.insertSteps(6, "With an exhalation slowly lower your torso and legs to a few inches above and parallel to the floor. There's a tendency in this pose for the lower back to sway toward the floor and the tailbone to poke up toward the ceiling. Throughout your stay in this position, keep the tailbone firmly in place and the legs very active and turned slightly inward. Draw the pubis toward the navel.");
        dbh.insertSteps(6, "Keep the space between the shoulder blades broad. Don't let the elbows splay out to the sides; hold them in by the sides of the torso and push them back toward the heels. Press the bases of the index fingers firmly to the floor. Lift the top of the sternum and your head to look forward.");
        dbh.insertSteps(6, "Chaturanga Dandasana is one of the positions in the Sun Salutation sequence. You can also practice this pose individually for anywhere from 10 to 30 seconds. Release with an exhalation. Either lay yourself lightly down onto the floor or push strongly back to Adho Mukha Svanasana, lifting through the top thighs and the tailbone.");
        dbh.insertBenefits(6, "Strengthens the arms and wrists");
        dbh.insertBenefits(6, "Tones the abdomen");


        dbh.insertPose("Gate Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU3MTM1OTc1Nzg2Mjg3/3hp_288_03_bjk2.webp",0);
        dbh.insertDetails(7,"Gate Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU3MTM1OTc1Nzg2Mjg3/3hp_288_03_bjk2.webp", "Extend some love to your often neglected side body in Parighasana or Gate Pose.");
        dbh.insertSteps(7, "Kneel on the floor. Stretch your right leg out to the right and press the foot to the floor, or use a block for extra support if you can't reach. Keep your left knee directly below your left hip (so the thigh is perpendicular to the floor), and align your right heel with the left knee. Turn your pelvis slightly to the right (so the left hip point comes forward of the right), but turn your upper torso back to the left. Point the kneecap toward the ceiling, which will require you to turn your right leg out.");
        dbh.insertSteps(7, "As you inhale, bring your arms out to your sides, parallel to the floor, palms down. Bend to the right over the plane of the right leg and lay your right hand down on the shin, ankle, or the floor outside the right leg. Contract the right side of the torso and stretch the left. Place your left hand on the outer left hip and push the pelvis down toward the floor. Then slip the hand up to the lower left ribs and lift them toward the shoulder, creating space in the left waist.");
        dbh.insertSteps(7, "With an inhalation, sweep the left arm over the back of the left ear. The side bend tends to drop the torso toward the floor. Without pushing the left hip back (continue to roll it slightly forward), turn the upper torso away from the floor.");
        dbh.insertSteps(7, "Stay in this pose anywhere from 30 seconds to a minute. Come up as you inhale, reaching through the top arm to draw the torso upright. Bring the right knee back beside the left, and repeat with the legs reversed.");
        dbh.insertSteps(7, "Full Parighasana is a deep side bend. From the starting position described in Step 2 above, lean to the side over the straight leg. Lower the underside of the torso as close as possible to the top of the straight leg. Press the back of the lower hand on the top of the foot, then sweep the top arm over the back of the ear and join the palms. Finish as described in Step 4 above.");
        dbh.insertBenefits(7, "Stretches the sides of the torso and spine");
        dbh.insertBenefits(7, "Stretches the hamstrings");
        dbh.insertBenefits(7, "Opens the shoulders");
        dbh.insertBenefits(7, "Stimulates abdominal organs and lungs");


        dbh.insertPose("Half Moon Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU0OTQxNTE2MTMwMDk1/2hp_291_1860_gn_bjk.webp",0);
        dbh.insertDetails(8,"Half Moon Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU0OTQxNTE2MTMwMDk1/2hp_291_1860_gn_bjk.webp", "Say hello to leg and ankle strength as you seek stability and extend into this balancing pose, Half Moon Pose.");
        dbh.insertSteps(8, "Perform Utthita Trikonasana to the right side, with your left hand resting on the left hip. Inhale, bend your right knee, and slide your left foot about 6 to 12 inches forward along the floor. At the same time, reach your right hand forward, beyond the little-toe side of the right foot, at least 12 inches.");
        dbh.insertSteps(8, "Exhale, press your right hand and right heel firmly into the floor, and straighten your right leg, simultaneously lifting the left leg parallel (or a little above parallel) to the floor. Extend actively through the left heel to keep the raised leg strong. Be careful not to lock (and so hyperextend) the standing knee: make sure the kneecap is aligned straight forward and isn't turned inward.");
        dbh.insertSteps(8, "Rotate your upper torso to the left, but keep the left hip moving slightly forward. Most beginners should keep the left hand on the left hip and the head in a neutral position, gazing forward.");
        dbh.insertSteps(8, "Bear the body's weight mostly on the standing leg. Press the lower hand lightly to the floor, using it to intelligently regulate your balance. Lift the inner ankle of the standing foot strongly upward, as if drawing energy from the floor into the standing groin. Press the sacrum and scapulas firmly against the back torso, and lengthen the coccyx toward the raised heel.");
        dbh.insertSteps(8, "Stay in this position for 30 seconds to 1 minute. Then lower the raised leg to the floor with an exhalation, and return to Trikonasana. Then perform the pose to the left for the same length of time.");
        dbh.insertBenefits(8, "Strengthens the abdomen, ankles, thighs, buttocks, and spine");
        dbh.insertBenefits(8, "Stretches the groins, hamstrings and calves, shoulders, chest, and spine");
        dbh.insertBenefits(8, "Improves coordination and sense of balance");
        dbh.insertBenefits(8, "Helps relieve stress");


        dbh.insertPose("High Lunge Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU3MTIzNjI3NzU0OTU4/3hp_288_07_bjk2.webp",0);
        dbh.insertDetails(9,"High Lunge Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU3MTIzNjI3NzU0OTU4/3hp_288_07_bjk2.webp", "This variation of High Lunge, sometimes called Crescent Pose, is a great preparation for the full version of Virabhadrasana I (Warrior I Pose)");
        dbh.insertSteps(9, "Start in Adho Mukha Svanasana (Downward-Facing Dog). Exhale and step your right foot forward between your hands, aligning your knee over the heel. Keep your left leg strong and firm.");
        dbh.insertSteps(9, "Inhale and raise your torso to upright. At the same time, sweep your arms wide to the sides and raise them overhead, palms facing.");
        dbh.insertSteps(9, "Be careful not to overarch the lower back. Lengthen your tailbone toward the floor and reach back through your left heel. This will bring the shoulder blades deeper into the back and help support your chest. Look up toward your thumbs.");
        dbh.insertSteps(9, "Be sure not to press the front ribs forward. Draw them down and into the torso. Lift the arms from the lower back ribs, reaching through your little fingers. Hold for 30 seconds to a minute.");
        dbh.insertSteps(9, "Then exhale, release the torso to the right thigh, sweep your hands back onto the floor, and, with another exhale, step your right foot back and return to Down Dog. Hold for a few breaths and repeat with the left foot forward for the same length of time.");
        dbh.insertBenefits(9, "Strengthens your core and back muscles");
        dbh.insertBenefits(9, "Stretches your chest and shoulders");


        dbh.insertPose("Plank Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU0MjUyOTc4OTg4ODQ3/editplankhp2_292_37428_cmyk.webp",0);
        dbh.insertDetails(10,"Plank Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU0MjUyOTc4OTg4ODQ3/editplankhp2_292_37428_cmyk.webp", "Nurture your love-hate relationship with Plank Pose. A beginner's best friend, it's the perfect precursor to more challenging arm balances.");
        dbh.insertSteps(10, "Start in Adho Mukha Svanasana. Then inhale and draw your torso forward until the arms are perpendicular to the floor and the shoulders directly over the wrists, torso parallel to the floor.");
        dbh.insertSteps(10, "Press your outer arms inward and firm the bases of your index fingers into the floor. Firm your shoulder blades against your back, then spread them away from the spine. Also spread your collarbones away from the sternum.");
        dbh.insertSteps(10, "Press your front thighs up toward the ceiling, but resist your tailbone toward the floor as you lengthen it toward the heels. Lift the base of the skull away from the back of the neck and look straight down at the floor, keeping the throat and eyes soft.");
        dbh.insertSteps(10, "Plank Pose is one of the positions in the traditional Sun Salutation sequence. You can also perform this pose by itself and stay anywhere from 30 seconds to 1 minute.");
        dbh.insertBenefits(10, "Strengthens the arms, wrists, and spine");
        dbh.insertBenefits(10, "Tones the abdomen");


        //1
        dbh.insertAnatomy("Ankles", "https://media.istockphoto.com/photos/ankle-injury-and-joint-painsports-injuries-picture-id867056016?k=6&m=867056016&s=612x612&w=0&h=V7LWzgSW8CIvDHOQKldmufuVYqiYqLUMImWecH6wJwk=");
        dbh.insertPose("Camel Pose","https://www.yogajournal.com/.image/ar_16:9%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cg_faces:center%2Cq_auto:good%2Cw_620/MTY4NDY2MTQ5Njc0MDY3MDIw/ccd03730.jpg ",1);
        dbh.insertDetails(0,"Camel Pose","https://www.yogajournal.com/.image/ar_16:9%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cg_faces:center%2Cq_auto:good%2Cw_620/MTY4NDY2MTQ5Njc0MDY3MDIw/ccd03730.jpg ", "Bump up your energy by bending back into Camel Pose.");
        dbh.insertSteps(0, "Begin kneeling with the thighs perpendicular to the floor, and the knees and feet hips distance apart. Extend the big toes straight back, pressing down with all 10 toenails and firming the outer ankles into the midline. Spin the inner thighs back and gently release the flesh of the buttocks towards the backs of the knees.");
        dbh.insertSteps(0, "The pelvis is neutral, neither spilling forward nor spilling back, and stacks directly over the knees. Root down from the tops of the feet to the knees; rebound up with the chest. Bring the palms together in front of the sternum and drop the chin towards the sternum. Take an inhale to emphasize the lift of the chest, then create Savasana arms (palms facing forward) and with the next exhale.");
        dbh.insertSteps(0, "Keeping the chin dropping and the pelvis over the knees, take the hands to the heels. Immediately press the shoulder blades forward and up and coil the thoracic spine to lift the chest any amount more. Having created more space/extension in the upper back, head can now drop back and hang free");
        dbh.insertSteps(0, "Continue pressing down with the feet and lower legs in order to lift up with the thoracic spine and chest. Hold for 5-10 breaths, then, leading with the sternum, use an inhale to come up (head is the last part of the body to exit.");
        dbh.insertBenefits(0, "Can boost energy and fight fatigue");
        dbh.insertBenefits(0, "Can help build confidence and empowerment");
        dbh.insertBenefits(0, "Can counteract slouching and kyphosis of the spine");
        dbh.insertBenefits(0, "Improves posture and counteracts the effects of sitting and computer work");


        dbh.insertPose("Chair Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTUyNzM1MjQ1NDQ0NTU4/hp_292_267_bjk.webp ",1);
        dbh.insertDetails(1,"Chair Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTUyNzM1MjQ1NDQ0NTU4/hp_292_267_bjk.webp ", "Chair Pose clearly works the muscles of the arms and legs, but it also stimulates the diaphragm and heart.");
        dbh.insertSteps(1, "Stand in Tadasana. Inhale and raise your arms perpendicular to the floor. Either keep the arms parallel, palms facing inward, or join the palms.");
        dbh.insertSteps(1, "Exhale and bend your knees, trying to take the thighs as nearly parallel to the floor as possible. The knees will project out over the feet, and the torso will lean slightly forward over the thighs until the front torso forms approximately a right angle with the tops of the thighs. Keep the inner thighs parallel to each other and press the heads of the thigh bones down toward the heels.");
        dbh.insertSteps(1, "Firm your shoulder blades against the back. Take your tailbone down toward the floor and in toward your pubis to keep the lower back long.");
        dbh.insertSteps(1, "Stay for 30 seconds to a minute. To come out of this pose straighten your knees with an inhalation, lifting strongly through the arms. Exhale and release your arms to your sides into Tadasana.");
        dbh.insertBenefits(1, "Strengthens the ankles, thighs, calves, and spine");
        dbh.insertBenefits(1, "Stretches shoulders and chest");
        dbh.insertBenefits(1, "Stimulates the abdominal organs, diaphragm, and heart");
        dbh.insertBenefits(1, "Reduces flat feet");


        dbh.insertPose("Cow Face Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_800/MTQ2MTgwNjczMjk0Mzc4NDI5/gomukhasana.webp ",1);
        dbh.insertDetails(2,"Cow Face Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_800/MTQ2MTgwNjczMjk0Mzc4NDI5/gomukhasana.webp ", "Can't see the cow face? Notice that the crossed legs look like the lips. The bent-elbow arms, one up and one down, are the ears.");
        dbh.insertSteps(2, "Sit in Dandasana (Staff Pose), then bend your knees and put your feet on the floor. Slide your left foot under the right knee to the outside of the right hip. Then cross your right leg over the left, stacking the right knee on top of the left, and bring the right foot to the outside of the left hip. Try to bring the heels equidistant from the hips: with the right leg on top you'll have to tug the right heel in closer to the left hip. Sit evenly on the sitting bones.");
        dbh.insertSteps(2, "Inhale and stretch your right arm straight out to the right, parallel to the floor. Rotate your arm inwardly; the thumb will turn first toward the floor, then point toward the wall behind you, with the palm facing the ceiling. This movement will roll your right shoulder slightly up and forward, and round your upper back. With a full exhalation, sweep the arm behind your torso and tuck the forearm in the hollow of your lower back, parallel to your waist, with the right elbow against the right side of your torso. Roll the shoulder back and down, then work the forearm up your back until it is parallel to your spine. The back of your hand will be between your shoulder blades. See that your right elbow doesn't slip away from the right side of your torso.");
        dbh.insertSteps(2, "Now inhale and stretch your left arm straight forward, pointing toward the opposite wall, parallel to the floor. Turn the palm up and, with another inhalation, stretch the arm straight up toward the ceiling, palm turned back. Lift actively through your left arm, then with an exhalation, bend the elbow and reach down for the right hand. If possible, hook the right and left fingers.");
        dbh.insertSteps(2, "Lift the left elbow toward the ceiling and, from the back armpit, descend the right elbow toward the floor. Firm your shoulder blades against your back ribs and lift your chest. Try to keep the left arm right beside the left side of your head.");
        dbh.insertSteps(2, "Stay in this pose about 1 minute. Release the arms, uncross the legs, and repeat with the arms and legs reversed for the same length of time. Remember that whichever leg is on top, the same-side arm is lower.");
        dbh.insertBenefits(2, "Stretches the ankles, hips and thighs, shoulders, armpits and triceps, and chest");


        dbh.insertPose("Eagle Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTUyNzM1MjQ1MDUxMzQy/eaglehp2_292_37370_cmyk.webp ",1);
        dbh.insertDetails(3,"Eagle Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTUyNzM1MjQ1MDUxMzQy/eaglehp2_292_37370_cmyk.webp ", "You need strength, flexibility, and endurance, and unwavering concentration for Eagle Pose.");
        dbh.insertSteps(3, "Stand in Tadasana. Bend your knees slightly, lift your left foot up and, balancing on your right foot, cross your left thigh over the right. Point your left toes toward the floor, press the foot back, and then hook the top of the foot behind the lower right calf. Balance on the right foot.");
        dbh.insertSteps(3, "Stretch your arms straight forward, parallel to the floor, and spread your scapulas wide across the back of your torso. Cross the arms in front of your torso so that the right arm is above the left, then bend your elbows. Snug the right elbow into the crook of the left, and raise the forearms perpendicular to the floor. The backs of your hands should be facing each other.");
        dbh.insertSteps(3, "Press the right hand to the right and the left hand to the left, so that the palms are now facing each other. The thumb of the right hand should pass in front of the little finger of the left. Now press the palms together (as much as is possible for you), lift your elbows up, and stretch the fingers toward the ceiling.");
        dbh.insertSteps(3, "Stay for 15 to 30 seconds, then unwind the legs and arms and stand in Tadasana again. Repeat for the same length of time with the arms and legs reversed.");
        dbh.insertBenefits(3, "Strengthens and stretches the ankles and calves");
        dbh.insertBenefits(3, "Stretches the thighs, hips, shoulders, and upper back");
        dbh.insertBenefits(3, "Improves concentration");
        dbh.insertBenefits(3, "Improves sense of balance");


        dbh.insertPose("Hero Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU2OTEyOTA1OTIyMzUx/3yp_289_4609_bjk.webp ",1);
        dbh.insertDetails(4,"Hero Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTU2OTEyOTA1OTIyMzUx/3yp_289_4609_bjk.webp ", "Virasana is a balm for tired legs at the end of the day, as well as an alternative to Lotus for seated meditation.");
        dbh.insertSteps(4, "Kneel on the floor (use a folded blanket or bolster to wedge between your calves and thighs if necessary), with your thighs perpendicular to the floor, and touch your inner knees together. Slide your feet apart, slightly wider than your hips, with the tops of the feet flat on the floor. Angle your big toes slightly in toward each other and press the top of each foot evenly on the floor.");
        dbh.insertSteps(4, "Exhale and sit back halfway, with your torso leaning slightly forward. Wedge your thumbs into the backs of your knees and draw the skin and flesh of the calf muscles toward the heels. Then sit down between your feet.");
        dbh.insertSteps(4, "If your buttocks don't comfortably rest on the floor, raise them on a block or thick book placed between the feet. Make sure both sitting bones are evenly supported. Allow a thumb's-width space between the inner heels and the outer hips. Turn your thighs inward and press the heads of the thigh bones into the floor with the bases of your palms. Then lay your hands in your lap, one on the other, palms up, or on your thighs, palms down.");
        dbh.insertSteps(4, "Firm your shoulder blades against the back ribs and lift the top of your sternum like a proud warrior. Widen the collarbones and release the shoulder blades away from the ears. Lengthen the tailbone into the floor to anchor the back torso.");
        dbh.insertSteps(4, "At first stay in this pose from 30 seconds to 1 minute. Gradually extend your stay up to 5 minutes. To come out, press your hands against the floor and lift your buttocks up, slightly higher than the heels. Cross your ankles underneath your buttocks, sit back over the feet and onto the floor, then stretch your legs out in front of you. It may feel good to bounce your knees up and down a few times on the floor.");
        dbh.insertBenefits(4, "Stretches the thighs, knees, and ankles");
        dbh.insertBenefits(4, "Strengthens the arches");
        dbh.insertBenefits(4, "Improves digestion and relieves gas");
        dbh.insertBenefits(4, "Helps relieve the symptoms of menopause");


        dbh.insertPose("Extended Hand Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTc4MTIxMTg1OTk0MTkw/2yp_285_1542_prf.webp ",1);
        dbh.insertDetails(5,"Extended Hand Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTc4MTIxMTg1OTk0MTkw/2yp_285_1542_prf.webp ", "In Extended Hand-to-big-toe Pose, maintaining solid grounding through the standing foot helps keep you steady.");
        dbh.insertSteps(5, "From Tadasana, bring your left knee toward your belly. Reach your left arm inside the thigh, cross it over the front ankle, and hold the outside of your left foot. If your hamstrings are tight, hold a strap looped around the left sole.");
        dbh.insertSteps(5, "Firm the front thigh muscles of the standing leg, and press the outer thigh inward.");
        dbh.insertSteps(5, "Inhale and extend the left leg forward. Straighten the knee as much as possible. If you're steady, swing the leg out to the side. Breathe steadily; breathing takes concentration, but it helps you balance.");
        dbh.insertSteps(5, "Hold for 30 seconds, then swing the leg back to center with an inhale, and lower the foot to the floor with an exhale. Repeat on the other side for the same length of time.");
        dbh.insertBenefits(5, "Strengthens the legs and ankles");
        dbh.insertBenefits(5, "Stretches the backs of the legs");
        dbh.insertBenefits(5, "Improves sense of balance");

        dbh.insertPose("Lotus Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_800/MTQ2MTgwNzI3MjM5NjE2MDMy/yogapedia-lotus-pose.webp ",1);
        dbh.insertDetails(6,"Lotus Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_800/MTQ2MTgwNzI3MjM5NjE2MDMy/yogapedia-lotus-pose.webp ", "The ultimate yoga pose, Padmasana or Lotus Pose requires open hips and consistent practice.");
        dbh.insertSteps(6, "Sit on the floor with your legs straight in front. Bend your right knee and bring the lower leg up into a cradle: The outer edge of the foot is notched into the crook of the left elbow, the knee is wedged into the crook of the right elbow, and the hands are clasped (if possible) outside the shin. Lift the front torso toward the inner right leg so the spine lengthens (and the lower back does not round). Rock your leg back and forth a few times, exploring the full range of movement of the hip joint.");
        dbh.insertSteps(6, "Bend the left knee and turn the leg out. Rock your right leg far out to the right, then lock the knee tight by pressing the back of the thigh to the calf. Next swing the leg across in front of your torso, swiveling from the hip and not the knee, and nestle the outside edge of the foot into the inner left groin. Be sure to bring the right knee as close to the left as possible, and press the right heel into the left lower belly. Ideally the sole of the foot is perpendicular to the floor, not parallel.");
        dbh.insertSteps(6, "Now lean back slightly, pick the right leg up off the floor, and lift the left leg in front of the right. To do this hold the underside of the left shin in your hands. Carefully slide the left leg over the right, snuggling the edge of the left foot deep into the right groin. Again swivel into position from the hip joint, pressing the heel against the lower belly, and arrange the sole perpendicular to the floor. Draw the knees as close together as possible. Use the edges of the feet to press the groins toward the floor and lift through the top of the sternum. If you wish, you can place the hands palms up in jnana mudra, with the thumbs and first fingers touching.");
        dbh.insertSteps(6, "Padmasana is the sitting asana par excellence, but it's not for everybody. Experienced students can use it as a seat for their daily pranayama or meditation, but beginners may need to use other suitable positions. In the beginning, only hold the pose for a few seconds and quickly release. Remember that Padmasana is a two-sided pose, so be sure to work with both leg crosses each time you practice. Gradually add a few seconds each week to your pose until you can sit comfortably for a minute or so. Ideally you should work with a teacher to monitor your progress.");
        dbh.insertBenefits(6, "Calms the brain");
        dbh.insertBenefits(6, "Stimulates the pelvis, spine, abdomen, and bladder");
        dbh.insertBenefits(6, "Stretches the ankles and knees");
        dbh.insertBenefits(6, "Eases menstrual discomfort and sciatica");


        dbh.insertPose("Mountain Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTUyNzM1MjQ1MzEzNDg2/mountainhp2_292_37362_cmyk.webp ",1);
        dbh.insertDetails(7,"Mountain Pose","https://www.yogajournal.com/.image/c_limit%2Ccs_srgb%2Cq_auto:good%2Cw_700/MTQ3MTUyNzM1MjQ1MzEzNDg2/mountainhp2_292_37362_cmyk.webp ", "The foundation of all standing poses, Mountain Pose makes a great a starting position, resting pose, or tool to improve posture.");
        dbh.insertSteps(7, "Stand with the bases of your big toes touching, heels slightly apart (so that your second toes are parallel). Lift and spread your toes and the balls of your feet, then lay them softly down on the floor. Rock back and forth and side to side. Gradually reduce this swaying to a standstill, with your weight balanced evenly on the feet.");
        dbh.insertSteps(7, "Firm your thigh muscles and lift the knee caps, without hardening your lower belly. Lift the inner ankles to strengthen the inner arches, then imagine a line of energy all the way up along your inner thighs to your groins, and from there through the core of your torso, neck, and head, and out through the crown of your head. Turn the upper thighs slightly inward. Lengthen your tailbone toward the floor and lift the pubis toward the navel.");
        dbh.insertSteps(7, "Press your shoulder blades into your back, then widen them across and release them down your back. Without pushing your lower front ribs forward, lift the top of your sternum straight toward the ceiling. Widen your collarbones. Hang your arms beside the torso.");
        dbh.insertSteps(7, "Balance the crown of your head directly over the center of your pelvis, with the underside of your chin parallel to the floor, throat soft, and the tongue wide and flat on the floor of your mouth. Soften your eyes.");
        dbh.insertSteps(7, "Tadasana is usually the starting position for all the standing poses. But it's useful to practice Tadasana as a pose in itself. Stay in the pose for 30 seconds to 1 minute, breathing easily.");
        dbh.insertBenefits(7, "Improves posture");
        dbh.insertBenefits(7, "Strengthens thighs, knees, and ankles");
        dbh.insertBenefits(7, "Firms abdomen and buttocks");
        dbh.insertBenefits(7, "Relieves sciatica");

        //2
        dbh.insertAnatomy("Arms","https://images.unsplash.com/photo-1492176273113-2d51f47b23b0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80");
        dbh.insertPose("Dolphin Plank Pose","https://www.yogajournal.com/.image/t_share/MTQ3MTU3Mjg5NTIwODY3MTE5/3anatomy_287_3356_bjk.jpg",2);
        dbh.insertDetails(3,"Dolphin Plank Pose","https://www.yogajournal.com/.image/t_share/MTQ3MTU3Mjg5NTIwODY3MTE5/3anatomy_287_3356_bjk.jpg", "A modification of Plank Pose, Dolphin Plank Pose strengthens and tones the core, thighs, and arms.");
        dbh.insertSteps(3, "Start in Dolphin Pose, knees bent. Then walk your feet back until your shoulders are directly over the elbows and your torso is parallel to the floor.");
        dbh.insertSteps(3, "Press your inner forearms and elbows firmly against the floor. Firm your shoulder blades against your back and spread them away from the spine. Similarly spread your collarbones away from the sternum.");
        dbh.insertSteps(3, "Press your front thighs toward the ceiling, but resist your tailbone toward the floor as you lengthen it toward the heels. Lift the base of your skull away from the back of the neck and look straight down at the floor, keeping the throat and eyes soft.");
        dbh.insertSteps(3, "Stay anywhere from 30 seconds to a minute. Then, release your knees to the floor with an exhale.");
        dbh.insertBenefits(3, "Calms the brain and helps relieve stress and mild depression");
        dbh.insertBenefits(3, "Stretches the shoulders, hamstrings, calves, and arches");
        dbh.insertBenefits(3, "Strengthens the arms and legs, and core");
        dbh.insertBenefits(3, "Helps prevent osteoporosis");

        dbh.insertPose("Downward-Facing Dog","https://www.yogajournal.com/.image/t_share/MTQ3MTU2NzMwOTA2NjgyODMw/2hp_290_1721_bjk.jpg",2);
        dbh.insertDetails(5,"Downward-Facing Dog","https://www.yogajournal.com/.image/t_share/MTQ3MTU2NzMwOTA2NjgyODMw/2hp_290_1721_bjk.jpg", "Deservedly one of yoga's most widely recognized yoga poses, Adho Mukha Svanasana, offer the ultimate all-over, rejuvenating stretch.");
        dbh.insertSteps(5, "Come onto the floor on your hands and knees. Set your knees directly below your hips and your hands slightly forward of your shoulders. Spread your palms, index fingers parallel or slightly turned out, and turn your toes under.");
        dbh.insertSteps(5, "Exhale and lift your knees away from the floor. At first keep the knees slightly bent and the heels lifted away from the floor. Lengthen your tailbone away from the back of your pelvis and press it lightly toward the pubis. Against this resistance, lift the sitting bones toward the ceiling, and from your inner ankles draw the inner legs up into the groins.");
        dbh.insertSteps(5, "Then with an exhalation, push your top thighs back and stretch your heels onto or down toward the floor. Straighten your knees but be sure not to lock them. Firm the outer thighs and roll the upper thighs inward slightly. Narrow the front of the pelvis.");
        dbh.insertSteps(5, "Firm the outer arms and press the bases of the index fingers actively into the floor. From these two points lift along your inner arms from the wrists to the tops of the shoulders. Firm your shoulder blades against your back, then widen them and draw them toward the tailbone. Keep the head between the upper arms; don't let it hang.");
        dbh.insertSteps(5, "Adho Mukha Svanasana is one of the poses in the traditional Sun Salutation sequence. It's also an excellent yoga asana all on its own. Stay in this pose anywhere from 1 to 3 minutes. Then bend your knees to the floor with an exhalation and rest in Child's Pose.");
        dbh.insertBenefits(5, "Helps relieve the symptoms of menopause");
        dbh.insertBenefits(5, "Relieves menstrual discomfort when done with head supported");
        dbh.insertBenefits(5, "Helps prevent osteoporosis");
        dbh.insertBenefits(5, "Improves digestion");



    }
}
